package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_2;

class PalindromeChecker {
    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
