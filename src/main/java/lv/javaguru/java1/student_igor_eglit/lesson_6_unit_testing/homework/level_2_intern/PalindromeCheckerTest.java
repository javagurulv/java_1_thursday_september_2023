package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_2_intern;
/*
Test Case1 :  text == deed : expected result - true;
Test Case2 :  text == deified : expected result - true;
Test Case3 :  text == Noon : expected result - true;
Test Case4 :  text == adam : expected result - false;
Test Case5 :  text == Panama :  expected result - false.
 */

public class PalindromeCheckerTest {
    public static void main(String[] args) {
        PalindromeCheckerTest palindromeCheckerTest = new PalindromeCheckerTest();
palindromeCheckerTest.testCase1();
palindromeCheckerTest.testCase2();
palindromeCheckerTest.testCase3();
palindromeCheckerTest.testCase4();
palindromeCheckerTest.testCase5();
    }

    public void testCase1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("deed");
        if (result) {
            System.out.println("Test Case1 \"deed\": OK");
        } else {
            System.out.println("Test Case1 \"deed\": FAIL");
        }
    }

    public void testCase2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("deified");
        if (result) {
            System.out.println("Test Case2 \"deified\": OK");
        } else {
            System.out.println("Test Case2 \"deified\": FAIL");
        }
    }

    public void testCase3() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Noon");
        if (result) {
            System.out.println("Test Case3 \"Noon\": OK");
        } else {
            System.out.println("Test Case3 \"Noon\": FAIL");
        }
    }

    public void testCase4() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("adam");
        if (result) {
            System.out.println("Test Case4 \"adam\": OK");
        } else {
            System.out.println("Test Case4 \"adam\": FAIL");
        }
    }public void testCase5() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Panama");
        if (result) {
            System.out.println("Test Case4 \"Panama\": OK");
        } else {
            System.out.println("Test Case4 \"Panama\": FAIL");
        }
    }
}
