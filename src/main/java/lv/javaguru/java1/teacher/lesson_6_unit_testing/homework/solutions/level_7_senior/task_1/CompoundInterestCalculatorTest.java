package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_7_senior.task_1;

class CompoundInterestCalculatorTest {

    public static void main(String[] args) {
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.shouldReturnZeroIfSumZero();
        test.shouldReturnSumIfInterestZero();
        test.shouldReturnSumIfYearsZero();
        test.shouldReturnCompoundInterestYear1();
        test.shouldReturnCompoundInterestYear2();
    }

    public void shouldReturnZeroIfSumZero() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double realInterest = calculator.compoundInterest(0.0, 0.1, 2);
        checkResult(realInterest, 0.0, "shouldReturnZeroIfSumZero");
    }

    public void shouldReturnSumIfInterestZero() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double realInterest = calculator.compoundInterest(10.0, 0.0, 2);
        checkResult(realInterest, 10.0, "shouldReturnSumIfInterestZero");
    }

    public void shouldReturnSumIfYearsZero() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double realInterest = calculator.compoundInterest(10.0, 0.1, 0);
        checkResult(realInterest, 10.0, "shouldReturnSumIfYearsZero");
    }

    public void shouldReturnCompoundInterestYear1() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double realInterest = calculator.compoundInterest(10.0, 1.0, 1);
        checkResult(realInterest, 10.1, "shouldReturnCompoundInterestYear1");
    }

    public void shouldReturnCompoundInterestYear2() {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        double realInterest = calculator.compoundInterest(10.0, 1.0, 2);
        checkResult(realInterest, 10.201, "shouldReturnCompoundInterestYear2");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double epsilon = 0.001d;
        if (Math.abs(realResult - expectedResult) < epsilon) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
