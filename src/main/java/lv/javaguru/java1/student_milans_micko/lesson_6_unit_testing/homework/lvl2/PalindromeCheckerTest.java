package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl2;

public class PalindromeCheckerTest {

    public static void main(String[] args) {
        PalindromeCheckerTest palindromeCheckerTest = new PalindromeCheckerTest();
        palindromeCheckerTest.testcase1();
        palindromeCheckerTest.testcase2();
        palindromeCheckerTest.testcase3();
        palindromeCheckerTest.testcase4();

    }
    //testcase1: level ; expected result: OK
    public boolean testcase1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("level");
        if (result) {
            System.out.println(" level : OK");
        } else {
            System.out.println(" level : FALSE");
        } return result;
    }
    //testcase2: nun ; expected result: OK
    public boolean testcase2() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Nun");
        if (result) {
            System.out.println(" Nun = OK");
        } else {
            System.out.println(" Nun - FALSE");
        } return result;
    }
    // testcase3: Kandza ; expected result: FALSE
    public boolean testcase3() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Kandza");
        if (result) {
            System.out.println(" Kandza = OK");
        } else {
            System.out.println(" Kandza - FALSE");
        } return result;
    }
    // testcase4: group ; expected result: FALSE
    public boolean testcase4() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("group");
        if (result) {
            System.out.println(" group = OK");
        } else {
            System.out.println(" group - FALSE");
        } return result;
    }
}
