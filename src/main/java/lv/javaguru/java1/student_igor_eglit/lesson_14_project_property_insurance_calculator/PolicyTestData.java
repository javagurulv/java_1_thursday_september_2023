package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class PolicyTestData {
    //First Policy
    static Policy example1() {
        var subObject_1_1 = new SubObject("TV", new BigDecimal("100.00"), RiskType.FIRE);
        var subObject_1_2 = new SubObject("PC", new BigDecimal("8.00"), RiskType.THEFT);
        var insuredObject_1_1 = new InsuredObject("House 1", subObject_1_1, subObject_1_2);
        return new Policy(new StringBuilder("1-C-1346-LV"), Status.REGISTERED, insuredObject_1_1);
    }

    //Second Policy
    static Policy example2() {
        var subObject_2_1 = new SubObject("TV", new BigDecimal("500.00"), RiskType.FIRE);
        var subObject_2_2 = new SubObject("PC", new BigDecimal("102.51"), RiskType.THEFT);
        var insuredObject_2_1 = new InsuredObject("House 1", subObject_2_1, subObject_2_2);
        return new Policy(new StringBuilder("1-C-1346-LV"), Status.REGISTERED, insuredObject_2_1);
    }

    public static void main(String[] args) {

        System.out.println(example1());
    }
}
