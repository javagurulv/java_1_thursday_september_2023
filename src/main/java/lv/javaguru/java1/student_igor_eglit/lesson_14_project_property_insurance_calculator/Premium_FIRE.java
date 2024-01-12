package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

class Premium_FIRE {


    public BigDecimal calculate(Policy policy) {

        BigDecimal threshold = new BigDecimal("100");
        BigDecimal defaultCoef = new BigDecimal("0.014");
        BigDecimal highCoef = new BigDecimal("0.024");

        List<InsuredObject> insuredObjects = Arrays.asList(policy.getInsuredObject());
        List<SubObject> subObjects = insuredObjects.stream()
                .flatMap(insuredObject -> Arrays.stream(insuredObject.getSubobject()))
                .toList();

        var sum =  subObjects.stream()
                .filter(subObject -> subObject.getRiskType().equals(RiskType.FIRE))
                .map(SubObject::getSubObjectInsurancePrise)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        var sumToImplementCoef = new InsuredSumMultiplyCoef();
        return sumToImplementCoef.toApplieCoef(sum, threshold, defaultCoef, highCoef);

    }
}