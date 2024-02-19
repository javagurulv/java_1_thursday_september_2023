package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest salaryTaxCalculatorTest = new SalaryTaxCalculatorTest();
        salaryTaxCalculatorTest.salary10kTax30Procent();
        salaryTaxCalculatorTest.salary30_50kTax40Procent();
        salaryTaxCalculatorTest.salary50kTax50Procent();

    }

    // testcase 1 = Salary 9000 , 30% tax:  expected = 2700
    void salary10kTax30Procent() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double tax = salaryTaxCalculator.calculate(9000);
        checkResult(tax, 2700, "Tax 30% Salary less 10k Test ");
    }

    // testcase 2 = Salary 20000 , 40% tax:  expected = 7000
    void salary30_50kTax40Procent() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double tax = salaryTaxCalculator.calculate(20000);
        checkResult(tax, 7000, "Tax 40% Salary 10k - 50k Test");
    }

    // testcase 3 = Salary 60000 , 50% tax:  expected = 24000
    void salary50kTax50Procent() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double tax = salaryTaxCalculator.calculate(60000);
        checkResult(tax, 24000, "Tax 50% Salary more 50k");
    }


    void checkResult(double result, int expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " FAIL! Expected = " + expectedResult + " but Result = " + result);
        }
    }

}
