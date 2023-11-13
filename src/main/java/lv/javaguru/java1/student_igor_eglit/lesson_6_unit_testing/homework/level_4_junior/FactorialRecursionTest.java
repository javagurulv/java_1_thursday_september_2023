package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_4_junior;
/*
Test Case1 : n = 0 : expected result = 1;
Test Case2 : n = 1 : expected result = 1;
Test Case3 : n = 5 : expected result = 120.
--------------------------------------------
FAILED
---------------------------------------------
 public int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
 */


public class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest factorialRecursionTest = new FactorialRecursionTest();
        factorialRecursionTest.testCase1();
        factorialRecursionTest.testCase2();
        factorialRecursionTest.testCase3();

    }

    public void testCase1() {
        FactorialRecursion factorialRecursion=new FactorialRecursion();
        int result = factorialRecursion.factorial(0);
        if (result == 1) {
            System.out.println("Test Case1 : n = 0 : expected result = 1 -  OK");
        } else {
            System.out.println("Test Case1 : n = 0 : expected result = 1 -  FAIL : actual result" + result);
        }
    }

    public void testCase2() {
        FactorialRecursion factorialRecursion=new FactorialRecursion();
        int result = factorialRecursion.factorial(1);
        if (result == 1) {
            System.out.println("Test Case2 : n = 1 : expected result = 1 -  OK");
        } else {
            System.out.println("Test Case2 : n = 1 : expected result = 1 -  FAIL : actual result" + result);
        }
    }
    public void testCase3() {
        FactorialRecursion factorialRecursion=new FactorialRecursion();
        int result = factorialRecursion.factorial(5);
        if (result == 120) {
            System.out.println("Test Case3 : n = 5 : expected result = 1 -  OK");
        } else {
            System.out.println("Test Case3 : n = 5 : expected result = 1 -  FAIL : actual result" + result);
        }
    }

}
