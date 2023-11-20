package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_7.lessoncode;

public class SumCalculator {

    public int calculateSum() {

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int calculateSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum = sum + i;
        }
        return sum;
    }


}