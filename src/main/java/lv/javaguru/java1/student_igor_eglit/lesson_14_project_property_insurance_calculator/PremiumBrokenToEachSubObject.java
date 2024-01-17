package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class PremiumBrokenToEachSubObject {
    final BigDecimal threshold = new BigDecimal("100");
    final BigDecimal defaultCoef = new BigDecimal("0.014");
    final BigDecimal highCoef = new BigDecimal("0.024");

    public List<SubObject> toShowPremiumForEachSub(Policy policy) {
        var insuredSumMultiplyCoef = new InsuredSumMultiplyCoef();
        List<SubObject> list = new ArrayList<>();
        int i = 0;
        Arrays.stream(policy.getInsuredObject()).flatMap(insuredObject -> Arrays.stream(insuredObject.getSubobject())).forEach(subObject -> {
            var sumWithCoef = insuredSumMultiplyCoef.toApplieCoef(subObject.getSubObjectInsurancePrise()
                    , threshold
                    , defaultCoef
                    , highCoef);
            SubObject subObjectNew = new SubObject(subObject.getSubObjectName(), sumWithCoef, subObject.getRiskType());
            list.add(i, subObjectNew);
        });
        return list;


    }
}
