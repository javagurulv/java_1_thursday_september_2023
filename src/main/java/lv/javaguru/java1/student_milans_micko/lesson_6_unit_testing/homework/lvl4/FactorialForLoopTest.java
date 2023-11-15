package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl4;

public class FactorialForLoopTest {

    public static void main(String[] args) {
        FactorialForLoopTest factorialForLoopTest = new FactorialForLoopTest();
        factorialForLoopTest.testcase1();
        factorialForLoopTest.testcase2();
    }

    //testcase1: 4 ; expected result: 24
    public void testcase1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(4);
        if (result == 24) {
            System.out.println("Result is 24 => OK");
        } else {
            System.out.println("Result is 24 => FALSE");
        }
    }
    //testcase2: 6 ; expected result: 720
    public void testcase2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(6);
        if (result == 720) {
            System.out.println("Result is 720 => OK");
        } else {
            System.out.println("Result is 720 => FALSE");
        }
    }


}
