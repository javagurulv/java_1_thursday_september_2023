package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class SingleSubObjectPremiumCalculatorImp implements SingleSubObjectPremiumCalculator {
    @Override
    public BigDecimal singleSubObjCalculator(SingleSubObject singleSubObject) {
        var insuredSumMultiplyCoef=new InsuredSumMultiplyCoef();
            return insuredSumMultiplyCoef.toApplieCoef(singleSubObject.getSubObjectInsurancePrise(),
                    singleSubObject.getThreshold(),
                    singleSubObject.getDefaultCoef(),
                    singleSubObject.getHighCoef()).setScale(2, RoundingMode.HALF_UP);
    }
}
