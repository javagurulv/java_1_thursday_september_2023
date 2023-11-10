package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_4_junior;

/*
Test Case1 : n = 3 : expected result = 6;
Test Case2 : n = 5 : expected result = 120.
 */
public class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest factorialForLoopTest = new FactorialForLoopTest();
        factorialForLoopTest.testCase1();
        factorialForLoopTest.testCase2();
    }

    public void testCase1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(3);
        if (result == 6) {
            System.out.println("Test Case1 : n = 3 : expected result = 6 - OK");
        } else {
            System.out.println("Test Case1 : n = 3 : expected result = 6 - Failed, actual result = " + result);
        }
    }

    public void testCase2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(5);
        if (result == 120) {
            System.out.println("Test Case1 : n = 5 : expected result = 120 - OK");
        } else {
            System.out.println("Test Case1 : n = 5 : expected result = 120 - Fail, actual result = " + result);
        }
    }
}
