package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;


class Premium_FIRE {


    public BigDecimal calculate(Policy policy) {

       final BigDecimal threshold = new BigDecimal("100");
       final BigDecimal defaultCoef = new BigDecimal("0.014");
       final BigDecimal highCoef = new BigDecimal("0.024");

        var insuredSumCalculation = new InsuredSumCalculation();
        var sum = insuredSumCalculation.toSumSubObjectsInsuredPrice(policy, RiskType.FIRE);
        var sumToImplementCoef = new InsuredSumMultiplyCoef();

        return sumToImplementCoef.toApplieCoef(sum, threshold, defaultCoef, highCoef);

    }
}