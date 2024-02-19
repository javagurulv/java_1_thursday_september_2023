package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class PalindromeChecker {
    public boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
