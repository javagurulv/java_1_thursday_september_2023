package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class MaxOfTwoNumbersTest {

    // 1. num1 = 12, num2 = 10; result = 12
    // 2. num1 = 5, num2 = 8; result = 8
    // 3. num1 = 5, num2 = 5; result = 5

    public static void main(String[] args) {
        MaxOfTwoNumbersTest test = new MaxOfTwoNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int result = maxOfTwoNumbers.max(12, 10);
        checkResult(result, 12, "test1");
    }

    public void test2() {
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
        int result = maxOfTwoNumbers.max(5, 8);
        checkResult(result, 8, "test2");
    }

    public void test3() {
        MaxOfTwoNumbers maxOfTwoNumbers = new MaxOfTwoNumbers();
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
