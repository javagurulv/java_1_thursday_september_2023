package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class SingleSubObjectTestData {
    static SingleSubObject example1() {
        return new SingleSubObject(new BigDecimal("100"),
                new BigDecimal("30"),
                new BigDecimal("0.014"),
                new BigDecimal("0.05"));
    }
}
