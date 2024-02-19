package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class FactorialRecursion {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
