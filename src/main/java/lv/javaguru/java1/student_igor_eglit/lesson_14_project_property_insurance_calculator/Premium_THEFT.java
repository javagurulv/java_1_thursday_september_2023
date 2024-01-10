package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class Premium_THEFT implements PremiumCalculator{
    @Override
    public BigDecimal calculate(Policy policy) {
        return BigDecimal.valueOf(0);
    }
}
