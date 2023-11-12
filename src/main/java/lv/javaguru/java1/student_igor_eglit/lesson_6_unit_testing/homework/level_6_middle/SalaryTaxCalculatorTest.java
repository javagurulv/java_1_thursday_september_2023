package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_6_middle;
/*
Test Case       Salary      Expected Result     Actual Result
    id1         -1              0
    id2          9999           2999.7
    id3         49999           19999.6
    id4         50001           25000.5

id1, -1, expected result 0 - OK, actual result 0.0
id2, 9999, expected result 2999.7 - OK, actual result 2999.7
id2, 49999, expected result 19999.6 - FAIL, actual result 18999.6
id2, 50001, expected result 25000.5 - FAIL, actual result 19000.5

fixed PROD CODE

id1, -1, expected result 0 - OK, actual result 0.0
id2, 9999, expected result 2999.7 - OK, actual result 2999.7
id2, 49999, expected result 19999.6 - OK, actual result 19999.6
id2, 50001, expected result 25000.5 - OK, actual result 25000.5

after extracted methods

id1, -1, expected result 0 - OK, actual result 0.0
id2, 9999, expected result 2999.7 - OK, actual result 2999.7
id2, 49999, expected result 19999.6 - OK, actual result 19999.6
id2, 50001, expected result 25000.5 - OK, actual result 25000.5


 */

public class SalaryTaxCalculatorTest {
    public static void main(String[] args) {
        SalaryTaxCalculatorTest salaryTaxCalculatorTest=new SalaryTaxCalculatorTest();
        salaryTaxCalculatorTest.id1();
        salaryTaxCalculatorTest.id2();
        salaryTaxCalculatorTest.id3();
        salaryTaxCalculatorTest.id4();
    }
    public void id1() {
        SalaryTaxCalculator salaryTaxCalculator=new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(-1);
        System.out.println(result==0 ? "id1, -1, expected result 0 - OK, actual result " + result : "id1, -1, expected result 0 - FAIL, actual result " + result);
    }
    public void id2() {
        SalaryTaxCalculator salaryTaxCalculator=new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(9999);
        System.out.println(result==2999.7 ? "id2, 9999, expected result 2999.7 - OK, actual result " + result : "id2, 9999, expected result 2999.7 - FAIL, actual result " + result);
    }
    public void id3() {
        SalaryTaxCalculator salaryTaxCalculator=new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(49999);
        System.out.println(result==19999.6 ? "id2, 49999, expected result 19999.6 - OK, actual result " + result : "id2, 49999, expected result 19999.6 - FAIL, actual result " + result);
    }
    public void id4() {
        SalaryTaxCalculator salaryTaxCalculator=new SalaryTaxCalculator();
        double result = salaryTaxCalculator.calculate(50001);
        System.out.println(result==25000.5 ? "id2, 50001, expected result 25000.5 - OK, actual result " + result : "id2, 50001, expected result 25000.5 - FAIL, actual result " + result);
    }
}
