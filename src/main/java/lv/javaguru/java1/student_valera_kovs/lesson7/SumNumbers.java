package lv.javaguru.java1.student_valera_kovs.lesson7;

public class SumNumbers {

    public int sumNumbers(int numberFrom, int numberTo) {
        int sum = 0;
        for (int i = numberFrom; i <= numberTo; i++) {
            sum += i;
        }
        return sum;
    }

}
