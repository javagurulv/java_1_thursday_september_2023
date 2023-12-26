package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_2;


public class PalindromeCheckTest {
    public static void main(String[] args) {

        PalindromeCheckTest palindromeCheckTest = new PalindromeCheckTest();
        palindromeCheckTest.testcase1();
        palindromeCheckTest.testcase2();
        palindromeCheckTest.testcase3();
        palindromeCheckTest.testcase4();

    }

    public boolean testcase1() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("artjom");
        if (result) {
            System.out.println(" artjom : OK");
        } else {
            System.out.println(" Artjom : FALSE");
        } return result;
    }

    public boolean testcase2() {
       PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("One");
        if (result) {
            System.out.println(" One = OK");
        } else {
            System.out.println(" one - FALSE");
        } return result;
    }

    public boolean testcase3() {
       PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Piece");
        if (result) {
            System.out.println(" Piece = OK");
        } else {
            System.out.println(" piece - FALSE");
        } return result;
    }

    public boolean testcase4() {
       PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Forever");
        if (result) {
            System.out.println(" Forever = OK");
        } else {
            System.out.println(" Forever - FALSE");
        } return result;
    }
}
