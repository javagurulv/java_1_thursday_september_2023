package lv.javaguru.java1.student_milans_micko.lesson_6.homework.lvl2;

class PalindromeChecker {

    //testcase1-
    //testcase2-

    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

}
