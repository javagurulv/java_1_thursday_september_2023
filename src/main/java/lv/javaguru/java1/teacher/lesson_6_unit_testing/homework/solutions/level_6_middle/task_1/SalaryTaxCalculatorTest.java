package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_6_middle.task_1;

class SalaryTaxCalculatorTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
        test.shouldReturnZeroIfIncomeLessZenZero();
        test.shouldReturn30TaxIfIncomeLessZen10k();
        test.shouldReturn30TaxIfIncomeEquals10k();
        test.shouldReturn30_40TaxIfIncomeLessZen50k();
        test.shouldReturn30_40TaxIfIncomeEquals50k();
        test.shouldReturn30_40_50TaxIfIncomeUnder50k();
    }

    public void shouldReturnZeroIfIncomeLessZenZero() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double realTax = calculator.calculate(-10.0);
        checkResult(realTax, 0.0, "shouldReturnZeroIfIncomeLessZenZero");
    }

    public void shouldReturn30TaxIfIncomeLessZen10k() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double realTax = calculator.calculate(1000.0);
        checkResult(realTax, 300.0, "shouldReturn30TaxIfIncomeLessZen10k");
    }

    public void shouldReturn30TaxIfIncomeEquals10k() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double realTax = calculator.calculate(10000.0);
        checkResult(realTax, 3000.0, "shouldReturn30TaxIfIncomeEquals10k");
    }

    public void shouldReturn30_40TaxIfIncomeLessZen50k() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double realTax = calculator.calculate(20000.0);
        checkResult(realTax, 7000.0, "shouldReturn30_40TaxIfIncomeLessZen50k");
    }

    public void shouldReturn30_40TaxIfIncomeEquals50k() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double realTax = calculator.calculate(50000.0);
        checkResult(realTax, 19000.0, "shouldReturn30_40TaxIfIncomeEquals50k");
    }

    public void shouldReturn30_40_50TaxIfIncomeUnder50k() {
        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double realTax = calculator.calculate(60000.0);
        checkResult(realTax, 24000.0, "shouldReturn30_40_50TaxIfIncomeUnder50k");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double epsilon = 0.000001d;
        if (Math.abs(realResult - expectedResult) < epsilon) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
