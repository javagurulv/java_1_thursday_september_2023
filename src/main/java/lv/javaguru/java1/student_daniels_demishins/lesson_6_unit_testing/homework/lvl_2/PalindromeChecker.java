package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_2;

class PalindromeChecker {
    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
