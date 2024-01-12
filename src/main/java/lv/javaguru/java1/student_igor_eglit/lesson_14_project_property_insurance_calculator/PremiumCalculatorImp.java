package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class PremiumCalculatorImp implements PremiumCalculator {

    Premium_FIRE premium_fire = new Premium_FIRE();
    Premium_THEFT premium_theft = new Premium_THEFT();

    @Override
    public BigDecimal calculator(Policy policy) {
        return premium_fire.calculate(policy).add(premium_theft.calculate(policy)).setScale(2, RoundingMode.HALF_UP);

    }
}
