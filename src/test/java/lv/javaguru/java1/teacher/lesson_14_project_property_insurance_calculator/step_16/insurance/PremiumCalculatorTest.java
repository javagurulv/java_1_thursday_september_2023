package lv.javaguru.java1.teacher.lesson_14_project_property_insurance_calculator.step_16.insurance;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
class PremiumCalculatorTest {

    private PremiumCalculator premiumCalculator = new PremiumCalculator();

    @Test
    public void oneObjectOneSubObjectFireSumInsuredUnder100() {
        InsuredSubObject tv = createSubObject("TV", "10.00", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("0.14").stripTrailingZeros(),
                     premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectFireSumInsured100() {
        InsuredSubObject tv = createSubObject("TV", "100.00", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("1.4").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectFireSumOver100() {
        InsuredSubObject tv = createSubObject("TV", "1000.00", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("24").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectTwoSubObjectsFireSumOver100() {
        InsuredSubObject tv = createSubObject("TV", "500.00", RiskType.FIRE);
        InsuredSubObject fridge = createSubObject("Fridge", "500.00", RiskType.FIRE);
        InsuredObject object = createInsuredObject("House 1", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("24").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectTheftSumInsuredUnder15() {
        InsuredSubObject tv = createSubObject("TV", "10.00", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("1.1").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectTheftSumInsured15() {
        InsuredSubObject tv = createSubObject("TV", "15.00", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("1.65").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectOneSubObjectTheftSumOver15() {
        InsuredSubObject tv = createSubObject("TV", "1000.00", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", tv);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("50").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void oneObjectTwoSubObjectsTheftSumOver15() {
        InsuredSubObject tv = createSubObject("TV", "500.00", RiskType.THEFT);
        InsuredSubObject fridge = createSubObject("Fridge", "500.00", RiskType.THEFT);
        InsuredObject object = createInsuredObject("House 1", tv, fridge);
        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object);
        BigDecimal premium = premiumCalculator.calculate(policy);
        assertEquals(new BigDecimal("50").stripTrailingZeros(),
                premium.stripTrailingZeros());
    }

    @Test
    public void twoObjectsOneSubObjectFireTheft() {
        InsuredSubObject tv = createSubObject("TV", "1000.00", RiskType.FIRE);
        InsuredObject object1 = createInsuredObject("House 1", tv);

        InsuredSubObject fridge = createSubObject("Fridge", "1000.00", RiskType.THEFT);
        InsuredObject object2 = createInsuredObject("House 2", fridge);

        Policy policy = createPolicy("LV-1", PolicyStatus.REGISTERED, object1, object2);

        BigDecimal premium = premiumCalculator.calculate(policy);

        assertEquals(new BigDecimal("74").stripTrailingZeros(),
                premium.stripTrailingZeros());
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