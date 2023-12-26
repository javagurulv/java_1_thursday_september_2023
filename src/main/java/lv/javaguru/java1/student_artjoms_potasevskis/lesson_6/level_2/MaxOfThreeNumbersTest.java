package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_2;

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
        int realResult = max.findMax(8, 7, 4);
        checkResult(realResult, 8, "firstNumberAreBigger");
    }

    public void secondNumberAreBigger() {
       MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int realResult = max.findMax(3, 7, 1);
        checkResult(realResult, 7, "secondNumberAreBigger");
    }

    public void thirdNumberAreBigger() {
        MaxOfThreeNumbers max = new MaxOfThreeNumbers();
        int realResult = max.findMax(11, 9, 25);
        checkResult(realResult, 25, "thirdNumberAreBigger");
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
