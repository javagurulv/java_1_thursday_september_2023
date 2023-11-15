package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl6;

public class SalaryTaxCalculatorTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorTest salaryTaxCalculatorTest = new SalaryTaxCalculatorTest();
        salaryTaxCalculatorTest.testsalary1();
        salaryTaxCalculatorTest.testsalary2();
        salaryTaxCalculatorTest.testsalary3();
    }
    //testsalary1: 7000; expected result: 2100
    public void testsalary1() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double tax = salaryTaxCalculator.calculate(7000);
        if (tax == 2100) {
            System.out.println("Salary is 7000, so taxes will be 2100 => OK");
        } else {
            System.out.println("Salary is 7000, so taxes will be 2100 => FALSE");
        }
    }
    //testsalary2: 25000; expected result: 9000
    public void testsalary2() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double tax = salaryTaxCalculator.calculate(25000);
        if (tax == 9000) {
            System.out.println("Salary is 25000, so taxes will be 9000 => OK");
        } else {
            System.out.println("Salary is 25000, so taxes will be 9000 => FALSE");
        }
    }
    //testsalary3: 68000; expected result: 28000
    public void testsalary3() {
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double tax = salaryTaxCalculator.calculate(68000);
        if (tax == 28000) {
            System.out.println("Salary is 68000, so taxes will be 28000 => OK");
        } else {
            System.out.println("Salary is 68000, so taxes will be 28000 => FALSE");
        }
    }

}
