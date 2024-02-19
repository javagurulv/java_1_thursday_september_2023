package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest factorialForLoopTest = new FactorialForLoopTest();
        factorialForLoopTest.factorial();

    }

    // testcase 1 = Factorial = 5! , expected result = 120
    void factorial() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int factor = factorialForLoop.factorial(5);
        if (factor == 120) {
            System.out.println("Factorial Test Ok");
        } else {
            System.out.println("Factorial Test Fail");
        }

    }


}
