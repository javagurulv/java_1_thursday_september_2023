package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class PolicyTestData {
    //First Policy
    SubObject subObject_1_1 = new SubObject("TV", new BigDecimal("100.00"), RiskType.FIRE);
    SubObject subObject_1_2 =new SubObject("PC", new BigDecimal("8.00"), RiskType.THEFT);
    InsuredObject insuredObject_1_1 = new InsuredObject("House 1", subObject_1_1, subObject_1_2);
    Policy testPolicy_1 = new Policy(new StringBuilder("1-C-1346-LV"),Status.REGISTERED , insuredObject_1_1);

    //Second Policy

    SubObject subObject_2_1 = new SubObject("TV", new BigDecimal("500.00"), RiskType.FIRE);
    SubObject subObject_2_2=new SubObject("PC", new BigDecimal("102.51"), RiskType.THEFT);
    InsuredObject insuredObject_2_1 = new InsuredObject("House 1", subObject_2_1, subObject_2_2);
    Policy testPolicy_2 = new Policy(new StringBuilder("1-C-1346-LV"),Status.REGISTERED , insuredObject_2_1);
}
