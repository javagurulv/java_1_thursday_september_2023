package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_4;

class FactorialForLoop {
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
