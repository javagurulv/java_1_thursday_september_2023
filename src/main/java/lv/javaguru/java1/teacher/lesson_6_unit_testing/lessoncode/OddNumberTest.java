package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.testIsEvenNumber();
        test.testIsOddNumber();
    }

    public void testIsOddNumber() {
        int number = 5;
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        checkResult(result, true, "testIsOddNumber");
    }

    public void testIsEvenNumber() {
        int number = 4;
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(number);
        checkResult(result, false, "testIsEvenNumber");
    }

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
