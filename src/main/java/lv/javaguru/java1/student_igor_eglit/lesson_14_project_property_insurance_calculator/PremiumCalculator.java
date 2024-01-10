package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

@FunctionalInterface
interface PremiumCalculator {
    BigDecimal calculate(Policy policy);
}
