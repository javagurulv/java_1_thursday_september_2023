package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_25.insurance;

import java.math.BigDecimal;

class FireRiskCalculator {

    private static final BigDecimal FIRE_SUM_INSURED_THRESHOLD = new BigDecimal("100");
    private static final BigDecimal FIRE_DEFAULT_COEFFICIENT = new BigDecimal("0.014");
    private static final BigDecimal FIRE_COEFFICIENT = new BigDecimal("0.024");

    BigDecimal calculatePremium(InsuredObject object) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        BigDecimal coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    private BigDecimal calculateSumInsuredFire(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRisks().contains(RiskType.FIRE))
                .map(InsuredSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(FIRE_SUM_INSURED_THRESHOLD) > 0
                ? FIRE_COEFFICIENT
                : FIRE_DEFAULT_COEFFICIENT;
    }

}
