package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_4_junior;

class FactorialRecursion {

    public int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
