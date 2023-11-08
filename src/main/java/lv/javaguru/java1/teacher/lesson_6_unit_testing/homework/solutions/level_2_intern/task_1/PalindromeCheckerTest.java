package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_2_intern.task_1;

class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest test = new PalindromeCheckerTest();
        test.shouldBePalindrome();
        test.shouldNotBePalindrome();
    }

    public void shouldBePalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        boolean realResult = checker.isPalindrome("abcba");
        checkResult(realResult, true, "shouldBePalindrome");
    }

    public void shouldNotBePalindrome() {
        PalindromeChecker checker = new PalindromeChecker();
        boolean realResult = checker.isPalindrome("abcbad");
        checkResult(realResult, false, "shouldNotBePalindrome");
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
