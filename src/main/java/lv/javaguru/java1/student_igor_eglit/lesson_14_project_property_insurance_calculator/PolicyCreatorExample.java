package lv.javaguru.java1.student_igor_eglit.lesson_14_project_property_insurance_calculator;

import java.math.BigDecimal;

class PolicyCreatorExample {


    //Example 1
    private final SubObject TV = new SubObject("TVset", new BigDecimal(100.25), RiskType.THEFT);
    private final InsuredObject house = new InsuredObject("House", TV);
    Policy policy = new Policy(new StringBuilder("1C-4567-LV"), Status.REGISTERED, house);

    //Example 2
    private final SubObject TV2 = new SubObject("TVset", new BigDecimal(300.50), RiskType.THEFT);
    private final SubObject fridge2 = new SubObject("Fridge", new BigDecimal(70.70), RiskType.FIRE);
    private final InsuredObject house2 = new InsuredObject("House2", TV2, fridge2);
    Policy policy2 = new Policy(new StringBuilder("1C-4568-LV"), Status.APPROVED, house2);

    //Example 3

    Policy policy3 = new Policy(new StringBuilder("1C-4569-LV"), Status.REGISTERED, house, house2);


    public static void main(String[] args) {
        PolicyCreatorExample policyCreatorExample = new PolicyCreatorExample();
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        var test1 = premiumCalculator.calculate(policyCreatorExample.policy);
        var test2 = premiumCalculator.calculate(policyCreatorExample.policy2);
        var test3 = premiumCalculator.calculate(policyCreatorExample.policy3);
        System.out.println(policyCreatorExample.policy);
        System.out.println(test1);
        System.out.println(policyCreatorExample.policy2);
        System.out.println(test2);
        System.out.println(policyCreatorExample.policy3);
        System.out.println(test3);

    }
}

