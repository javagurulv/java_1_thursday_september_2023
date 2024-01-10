package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class PolicyCreatorExample {
    private final SubObject TV = new SubObject("TVset", new BigDecimal(100),RiskType.THEFT);
    private final SubObject fridge = new SubObject("Fridge", new BigDecimal(70),RiskType.FIRE);
private final InsuredObject house = new InsuredObject("House",TV);
private final InsuredObject house2 = new InsuredObject("House2",TV,fridge);
    Policy policy = new Policy(new StringBuilder("1C-4567-LV"),Status.REGISTERED, house);
    Policy policy2=new Policy(new StringBuilder("1C-4568-LV"), Status.APPROVED, house2);
    Policy policy3=new Policy(new StringBuilder("1C-4569-LV"), Status.REGISTERED, house, house2);

    public static void main(String[] args) {
      PolicyCreatorExample policyCreatorExample=new PolicyCreatorExample();
        System.out.println(policyCreatorExample.policy);
    }
}

