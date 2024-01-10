package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

@FunctionalInterface
interface PremiumCalculator {
    float calculate(Policy policy);
}
