package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl4;

class FactorialForLoop {

    //testcase1: 4 ; expected result: 24
    //testcase2: 6 ; expected result: 720

    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
