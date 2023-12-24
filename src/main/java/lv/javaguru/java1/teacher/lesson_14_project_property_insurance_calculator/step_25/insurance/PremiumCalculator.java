package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_25.insurance;

import java.math.BigDecimal;

public class PremiumCalculator {

    private FireRiskCalculator fireRiskCalculator = new FireRiskCalculator();
    private TheftRiskCalculator theftRiskCalculator = new TheftRiskCalculator();
    private FloodRiskCalculator floodRiskCalculator = new FloodRiskCalculator();


    public BigDecimal calculate(Policy policy) {
        return policy.getObjects().stream()
                .map(this::calculateInsuredObjectPremium)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal calculateInsuredObjectPremium(InsuredObject object) {
        BigDecimal premiumFire = fireRiskCalculator.calculatePremium(object);
        BigDecimal premiumTheft = theftRiskCalculator.calculatePremium(object);
        BigDecimal premiumFlood = floodRiskCalculator.calculatePremium(object);
        return premiumFire.add(premiumTheft).add(premiumFlood);
    }

}
