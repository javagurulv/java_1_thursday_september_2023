package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_2;

public class PalidromeCheckerTest {
    public static void main(String[] args) {
        PalidromeCheckerTest palidromeCheckerTest = new PalidromeCheckerTest();
        palidromeCheckerTest.palidromeTest1();
        palidromeCheckerTest.palidromeTest2();

    }


    void palidromeTest1(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Danik");
        if(result){
            System.out.println("Test Palidrome is Ok");
        } else {
            System.out.println("Test Palidrome Fail");
        }
    }

    void palidromeTest2(){
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean result = palindromeChecker.isPalindrome("Topot");
        if(result){
            System.out.println("Test Palidrome is Ok");
        } else {
            System.out.println("Test Palidrome Fail");
        }
    }
}
