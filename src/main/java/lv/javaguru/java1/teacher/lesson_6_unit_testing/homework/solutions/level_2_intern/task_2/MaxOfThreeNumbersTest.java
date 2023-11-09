package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_2_intern.task_2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.firstNumberAreBigger();
        test.secondNumberAreBigger();
        test.thirdNumberAreBigger();
        test.allNumbersAreEquals();
    }

    public void firstNumberAreBigger() {
        MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int realResult = max.findMax(4, 3, 2);
        checkResult(realResult, 4, "firstNumberAreBigger");
    }

    public void secondNumberAreBigger() {
        MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int realResult = max.findMax(4, 20, 2);
        checkResult(realResult, 20, "secondNumberAreBigger");
    }

    public void thirdNumberAreBigger() {
        MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int realResult = max.findMax(4, 3, 20);
        checkResult(realResult, 20, "thirdNumberAreBigger");
    }

    public void allNumbersAreEquals() {
        MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int realResult = max.findMax(4, 4, 4);
        checkResult(realResult, 4, "allNumbersAreEquals");
    }

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
