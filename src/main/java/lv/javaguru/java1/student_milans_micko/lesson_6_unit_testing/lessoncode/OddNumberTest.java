package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.lessoncode;


public class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.testIsOddNumber();
    }
    // test case 1: number = 5; expected result = true
    public void testIsOddNumber() {
        int number = 5;
       OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        checkResult(result, true, "testIsOddNumber");
    }
    // test case 2: number = 2; expected result = false
    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
