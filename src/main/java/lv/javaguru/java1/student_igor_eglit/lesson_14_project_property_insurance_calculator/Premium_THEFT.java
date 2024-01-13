package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;


class Premium_THEFT {


    public BigDecimal calculate(Policy policy) {

        final BigDecimal threshold = new BigDecimal("15");
        final BigDecimal defaultCoef = new BigDecimal("0.11");
        final BigDecimal highCoef = new BigDecimal("0.05");

        var insuredSumCalculation = new InsuredSumCalculation();
        var sum = insuredSumCalculation.toSumSubObjectsInsuredPrice(policy, RiskType.THEFT);
        var sumToImplementCoef = new InsuredSumMultiplyCoef();

        return sumToImplementCoef.toApplieCoef(sum, threshold, defaultCoef, highCoef);

    }
}
