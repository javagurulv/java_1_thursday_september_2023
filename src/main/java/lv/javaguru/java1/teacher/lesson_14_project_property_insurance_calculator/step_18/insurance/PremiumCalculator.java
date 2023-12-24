package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_18.insurance;

import java.math.BigDecimal;
import java.util.List;

public class PremiumCalculator {

    public BigDecimal calculate(Policy policy) {
        BigDecimal premium = BigDecimal.ZERO;
        for (InsuredObject object : policy.getObjects()) {
            BigDecimal premiumFire = calculatePremiumFire(object);
            BigDecimal premiumTheft = calculatePremiumTheft(object);
            premium = premium.add(premiumFire).add(premiumTheft);
        }
        return premium;
    }

    private BigDecimal calculatePremiumFire(InsuredObject object) {
        BigDecimal sumInsuredFire = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if (subObjectRisks.contains(RiskType.FIRE)) {
                sumInsuredFire = sumInsuredFire.add(subObject.getSum());
            }
        }
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal coefficentFire = new BigDecimal("0.014");
        if (sumInsuredFire.compareTo(oneHundred) > 0) {
            coefficentFire = new BigDecimal("0.024");
        }
        return sumInsuredFire.multiply(coefficentFire);
    }

    private BigDecimal calculatePremiumTheft(InsuredObject object) {
        BigDecimal sumInsuredTheft = BigDecimal.ZERO;
        for (InsuredSubObject subObject : object.getSubObjects()) {
            List<RiskType> subObjectRisks = subObject.getRisks();
            if (subObjectRisks.contains(RiskType.THEFT)) {
                sumInsuredTheft = sumInsuredTheft.add(subObject.getSum());
            }
        }
        BigDecimal fifteen = new BigDecimal("15");
        BigDecimal coefficentTheft = new BigDecimal("0.11");
        if (sumInsuredTheft.compareTo(fifteen) > 0) {
            coefficentTheft = new BigDecimal("0.05");
        }
        return sumInsuredTheft.multiply(coefficentTheft);
    }

}
