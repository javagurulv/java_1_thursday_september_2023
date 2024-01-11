package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

class PremiumCalculator {
    Premium_THEFT premium_theft;
    Premium_FIRE premium_fire;

    BigDecimal calculate(Policy policy) {

        var premium_THEFT = premium_theft.calculate(policy).compareTo(BigDecimal.valueOf(15)) <= 0 ? premium_theft.calculate(policy)
                .multiply(BigDecimal.valueOf(0.11)) : premium_theft.calculate(policy)
                .multiply(BigDecimal.valueOf(0.05));
        //COEFFICIENT_THEFT - by default 0.11 but if SUM_INSURED_THEFT equal or greater than
        //15 then 0.05. PREMIUM_FIRE = SUM_INSURED_FIRE * COEFFICIENT_FIRE
        var premium_FIRE = premium_fire.calculate(policy).compareTo(BigDecimal.valueOf(100)) <= 0 ? premium_fire.calculate(policy)
                .multiply(BigDecimal.valueOf(0.014)) : premium_fire.calculate(policy)
                .multiply(BigDecimal.valueOf(0.024));
//COEFFICIENT_FIRE - by default 0.014 but if SUM_INSURED_FIRE is over 100 then 0.024. PREMIUM_THEFT = SUM_INSURED_THEFT * COEFFICIENT_THEFT


        return premium_FIRE.add(premium_THEFT).setScale(2, RoundingMode.HALF_UP);

    }
}
