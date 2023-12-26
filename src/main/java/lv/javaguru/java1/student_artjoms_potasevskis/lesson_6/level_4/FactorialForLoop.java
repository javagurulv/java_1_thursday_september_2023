package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_4;

class FactorialForLoop {
    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
