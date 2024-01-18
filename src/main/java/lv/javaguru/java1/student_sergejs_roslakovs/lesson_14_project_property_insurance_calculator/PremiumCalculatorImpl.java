package lv.javaguru.java1.student_sergejs_roslakovs.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class PremiumCalculatorImpl implements PremiumCalculator {

    private BigDecimal calculateSumInsuredFire(Policy policy) {
        return policy.getInsuranceObjects().stream()
                .flatMap(insuranceObject -> insuranceObject.getSubObjects().stream())
                .filter(subObject -> subObject.getRiskType() == RiskType.FIRE)
                .map(subObject -> subObject.getSumInsured())
                .reduce((x, y) -> x.add(y))
                .orElse(BigDecimal.ZERO);
    }

    private BigDecimal selectCoefficientFire(BigDecimal sumInsuredFire) {
        var border = new BigDecimal("100");
        if (sumInsuredFire.compareTo(border) < 0) {
            return new BigDecimal("0.014");
        } else {
            return new BigDecimal("0.024");
        }
    }


    private BigDecimal calculateFire(Policy policy) {
        var sumInsuredFire = calculateSumInsuredFire(policy);
        var coefficientFire = selectCoefficientFire(sumInsuredFire);
        return sumInsuredFire.multiply(coefficientFire);
    }

    private BigDecimal calculateTheft(Policy policy) {
        return null;
    }

    @Override
    public BigDecimal calculate(Policy policy) {
        // calculate FIRE (input: policy) out = BigDecimal
        // calculate THEFT (input: policy) out = BigDecimal

        // result = FIRE + THEFT -> BigDecimal
        var premiumFire = calculateFire(policy);
        var premiumTheft = calculateTheft(policy);
        return premiumFire.add(premiumTheft).setScale(2, RoundingMode.HALF_UP);


        // FIRE:
        // calculate SUM_INSURED_FIRE (policy)
        // select coefficient FIRE (SUM_INSURED_FIRE) -> coef BigDecimal
        // FIRE = SUM_INSURED_FIRE * COEFFICIENT_FIRE -> BigDecimal

        // THEFT:
        // calculate SUM_INSURED_THEFT
        // select coefficient THEFT
        // FIRE = SUM_INSURED_THEFT * COEFFICIENT_FIRE

    }


}
