package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl7;

public class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest compoundInterestCalculatorTest = new CompoundInterestCalculatorTest();
        compoundInterestCalculatorTest.compoundInterestWithZeroSum();
        compoundInterestCalculatorTest.compoundInterestWithZeroInterest();
        compoundInterestCalculatorTest.compoundInterestWithZeroYears();
        compoundInterestCalculatorTest.compoundInterest();
    }
    //testcase1: 0, 5, 10; expected result: 0
    public void compoundInterestWithZeroSum () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(0,5,10);
        if (result == 0) {
            System.out.println("If sum is 0, interest is 5 and years is 10 = result is 0 => OK");
        } else {
            System.out.println("If sum is 0, interest is 5 and years is 10 = result is 0 => FALSE");
        }
    }
    //testcase2: 1000, 5, 0; expected result: 0
    public void compoundInterestWithZeroInterest () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(1000,0,10);
        if (result == 1000) {
            System.out.println("If sum is 1000, interest is 0 and years is 10 = result is 1000 => OK");
        } else {
            System.out.println("If sum is 1000, interest is 0 and years is 10 = result is 1000 => FALSE");
        }
    }
    //testcase3: 1000, 0, 10; expected result: 0
    public void compoundInterestWithZeroYears () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(1000,5,0);
        if (result == 1000) {
            System.out.println("If sum is 1000, interest is 5 and years is 0 = result is 1000 => OK");
        } else {
            System.out.println("If sum is 1000, interest is 5 and years is 0 = result is 1000 => FALSE");
        }
    }
    //testcase4: 1000, 5, 10; expected result:
    public void compoundInterest () {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(1000,5,10);
        if (result >= 1628.89) {
            System.out.println("If sum is 1000, interest is 5 and years is 10 = result is approximately 1628.89 => OK");
        } else {
            System.out.println("If sum is 1000, interest is 5 and years is 10 = result is approximately 1628.89 => FALSE");
        }
    }
}
