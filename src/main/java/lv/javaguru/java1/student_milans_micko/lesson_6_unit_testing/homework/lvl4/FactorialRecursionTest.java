package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl4;

public class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest factorialRecursionTest = new FactorialRecursionTest();
        factorialRecursionTest.testcase1();
        factorialRecursionTest.testcase2();
        factorialRecursionTest.testcase3();
    }

    //testcase1: 3 ; expected result: 6
    public void testcase1() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(3);
        if (result == 6) {
            System.out.println("Test result 6 => OK");
        } else {
            System.out.println("Test result 6 => FALSE");
        }
    }

    //testcase2: 6 ; expected result: 720
    public void testcase2() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(6);
        if (result == 720) {
            System.out.println("Test result 24 => OK");
        } else {
            System.out.println("Test result 24 => FALSE");
        }
    }
    //testcase2: 0 ; expected result: 1
    public void testcase3() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(0);
        if (result == 1) {
            System.out.println("Test result 1 => OK");
        } else {
            System.out.println("Test result 1 => FALSE");
        }
    }


}
