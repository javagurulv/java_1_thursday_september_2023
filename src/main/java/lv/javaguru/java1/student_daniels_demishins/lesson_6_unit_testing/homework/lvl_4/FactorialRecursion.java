package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_4;

class FactorialRecursion {
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}
