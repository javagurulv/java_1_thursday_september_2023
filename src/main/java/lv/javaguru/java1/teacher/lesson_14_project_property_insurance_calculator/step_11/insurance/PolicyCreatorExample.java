package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_11.insurance;

import java.math.BigDecimal;
import java.util.Arrays;

public class PolicyCreatorExample {

    public static void main(String[] args) {
        // Example 1
        InsuredSubObject tv1 = createSubObject("TV", "1000.50", RiskType.FIRE);
        InsuredObject object1 = createInsuredObject("House 1", tv1);
        Policy policy1 = createPolicy("LV-1", PolicyStatus.REGISTERED, object1);

        // Example 2
        InsuredSubObject tv2 = createSubObject("TV", "1000.50", RiskType.FIRE);
        InsuredSubObject fridge2 = createSubObject("Fridge", "500.50", RiskType.THEFT);
        InsuredObject object2 = createInsuredObject("House 2", tv2, fridge2);
        Policy policy2 = createPolicy("LV-2", PolicyStatus.REGISTERED, object2);

        // Example 3
        InsuredSubObject tv31 = createSubObject("TV", "1000.50", RiskType.FIRE);
        InsuredSubObject fridge32 = createSubObject("Fridge", "500.50", RiskType.THEFT);
        InsuredObject object31 = createInsuredObject("House 31", tv2);
        InsuredObject object32 = createInsuredObject("House 32", fridge2);
        Policy policy3 = createPolicy("LV-3", PolicyStatus.REGISTERED, object31, object32);

    }

    private static Policy createPolicy(String number,
                                       PolicyStatus status,
                                       InsuredObject ... objects) {
        return new Policy(
                number,
                status,
                Arrays.stream(objects).toList()
        );
    }

    private static InsuredObject createInsuredObject(String name,
                                              InsuredSubObject ... subObjects) {
        return new InsuredObject(
                name,
                Arrays.stream(subObjects).toList()
        );
    }

    private static InsuredSubObject createSubObject(String name,
                                             String sumInsured,
                                             RiskType ... riskTypes) {
        return new InsuredSubObject(
                name,
                new BigDecimal(sumInsured),
                Arrays.stream(riskTypes).toList()
        );
    }

}
