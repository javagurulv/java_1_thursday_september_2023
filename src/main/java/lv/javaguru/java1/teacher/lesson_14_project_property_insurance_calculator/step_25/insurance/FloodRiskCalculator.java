package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_25.insurance;

import java.math.BigDecimal;

class FloodRiskCalculator {

    private static final BigDecimal FLOOD_SUM_INSURED_THRESHOLD = new BigDecimal("100");
    private static final BigDecimal FLOOD_DEFAULT_COEFFICIENT = new BigDecimal("0.014");
    private static final BigDecimal FLOOD_COEFFICIENT = new BigDecimal("0.024");

    BigDecimal calculatePremium(InsuredObject object) {
        BigDecimal sumInsuredFlood = calculateSumInsuredFlood(object);
        BigDecimal coefficientFlood = selectCoefficientFlood(sumInsuredFlood);
        return sumInsuredFlood.multiply(coefficientFlood);
    }

    private BigDecimal calculateSumInsuredFlood(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRisks().contains(RiskType.FLOOD))
                .map(InsuredSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal selectCoefficientFlood(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(FLOOD_SUM_INSURED_THRESHOLD) > 0
                ? FLOOD_COEFFICIENT
                : FLOOD_DEFAULT_COEFFICIENT;
    }

}
