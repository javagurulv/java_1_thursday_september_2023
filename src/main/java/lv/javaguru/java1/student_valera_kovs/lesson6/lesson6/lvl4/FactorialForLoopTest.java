package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6.lvl4;

class FactorialForLoopTest {

        public static void main(String[] args) {
            FactorialForLoopTest factorialForLoopTest = new FactorialForLoopTest();
            factorialForLoopTest.testCase1();
            factorialForLoopTest.testCase2();
        }

        public void testCase1() {
            FactorialForLoop factorialForLoop = new FactorialForLoop();
            int result = factorialForLoop.factorial(4);
            if (result == 24) {
                System.out.println("TestCase1 = OK");
            } else {
                System.out.println("TestCase1 = Fail");
            }
        }

        public void testCase2() {
            FactorialForLoop factorialForLoop = new FactorialForLoop();
            int result = factorialForLoop.factorial(5);
            if (result == 120) {
                System.out.println("TestCase2 = OK");
            } else {
                System.out.println("TestCase2 = Fail");
            }
        }
    }
