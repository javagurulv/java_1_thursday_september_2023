package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_26.insurance;

import java.math.BigDecimal;

class TheftRiskCalculator {

    private static final BigDecimal THEFT_SUM_INSURED_THRESHOLD = new BigDecimal("15");
    private static final BigDecimal THEFT_DEFAULT_COEFFICIENT = new BigDecimal("0.11");
    private static final BigDecimal THEFT_COEFFICIENT = new BigDecimal("0.05");

    BigDecimal calculatePremium(InsuredObject object) {
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft(object);
        BigDecimal coefficientTheft = selectCoefficientTheft(sumInsuredTheft);
        return sumInsuredTheft.multiply(coefficientTheft);
    }

    private BigDecimal calculateSumInsuredTheft(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRisks().contains(RiskType.THEFT))
                .map(InsuredSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal selectCoefficientTheft(BigDecimal sumInsuredTheft) {
        return sumInsuredTheft.compareTo(THEFT_SUM_INSURED_THRESHOLD) > 0
                ? THEFT_COEFFICIENT
                : THEFT_DEFAULT_COEFFICIENT;
    }

}
