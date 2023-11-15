package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6.lvl4;

public class FactorialForLoop {


    public int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
