package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_19.insurance;

import java.math.BigDecimal;

public class PremiumCalculator {

    private static final BigDecimal FIRE_SUM_INSURED_THRESHOLD = new BigDecimal("100");
    private static final BigDecimal THEFT_SUM_INSURED_THRESHOLD = new BigDecimal("15");
    private static final BigDecimal FIRE_DEFAULT_COEFFICIENT = new BigDecimal("0.014");
    private static final BigDecimal FIRE_COEFFICIENT = new BigDecimal("0.024");
    private static final BigDecimal THEFT_DEFAULT_COEFFICIENT = new BigDecimal("0.11");
    private static final BigDecimal THEFT_COEFFICIENT = new BigDecimal("0.05");


    public BigDecimal calculate(Policy policy) {
        return policy.getObjects().stream()
                .map(this::calculateInsuredObjectPremium)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculateInsuredObjectPremium(InsuredObject object) {
        BigDecimal premiumFire = calculatePremiumFire(object);
        BigDecimal premiumTheft = calculatePremiumTheft(object);
        return premiumFire.add(premiumTheft);
    }

    private BigDecimal calculatePremiumFire(InsuredObject object) {
        BigDecimal sumInsuredFire = calculateSumInsuredFire(object);
        BigDecimal coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    private BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        return sumInsuredFire.compareTo(FIRE_SUM_INSURED_THRESHOLD) > 0
                ? FIRE_COEFFICIENT
                : FIRE_DEFAULT_COEFFICIENT;
    }

    private BigDecimal calculateSumInsuredFire(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRisks().contains(RiskType.FIRE))
                .map(InsuredSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculatePremiumTheft(InsuredObject object) {
        BigDecimal sumInsuredTheft = calculateSumInsuredTheft(object);
        BigDecimal coefficientTheft = selectCoefficientTheft(sumInsuredTheft);
        return sumInsuredTheft.multiply(coefficientTheft);
    }

    private BigDecimal selectCoefficientTheft(BigDecimal sumInsuredTheft) {
        return sumInsuredTheft.compareTo(THEFT_SUM_INSURED_THRESHOLD) > 0
                ? THEFT_COEFFICIENT
                : THEFT_DEFAULT_COEFFICIENT;
    }

    private BigDecimal calculateSumInsuredTheft(InsuredObject object) {
        return object.getSubObjects().stream()
                .filter(insuredSubObject -> insuredSubObject.getRisks().contains(RiskType.THEFT))
                .map(InsuredSubObject::getSum)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
