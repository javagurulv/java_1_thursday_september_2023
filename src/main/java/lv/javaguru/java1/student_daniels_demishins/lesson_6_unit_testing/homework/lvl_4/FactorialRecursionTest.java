package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_4;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest factorialRecursionTest = new FactorialRecursionTest();
        factorialRecursionTest.factorialRecursion();

    }

    // testcase 1 = Factorial Resursion = 5 , expected result = 120
    void factorialRecursion() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int rec = factorialRecursion.factorial(5);
        if (rec == 120) {
            System.out.println("Test Factorial Recursion OK");
        } else {
            System.out.println("Test Factorial Recursion  Fail! Result must be "+ rec);
        }
    }


}
