package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_6.lessoncode;


class MaxNumbersTest {

    // 1. num1 = 12, num2 = 10; result = 12
    // 2. num1 = 5, num2 = 8; result = 8
    // 3. num1 = 5, num2 = 5; result = 5

    public static void main(String[] args) {
        MaxNumbersTest test = new MaxNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        MaxNumbers maxOfTwoNumbers = new MaxNumbers();
        int result = maxOfTwoNumbers.max(12, 10);
        checkResult(result, 12, "test1");
    }

    public void test2() {
        MaxNumbers maxNumbers = new MaxNumbers();
        int result = maxNumbers.max(5, 8);
        checkResult(result, 8, "test2");
    }

    public void test3() {
        MaxNumbers maxOfTwoNumbers = new MaxNumbers();
        int result = maxOfTwoNumbers.max(5, 5);
        checkResult(result, 5, "test3");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }


}