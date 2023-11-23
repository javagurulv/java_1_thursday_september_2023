package lv.javaguru.java1.student_kirils_petrovs.lesson_7_array_for.lessoncode.myLesonCode;

public class SumCalculator {

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int sum = calculator.calculateSum();
        System.out.println("Sum: " + sum);
    }

    public int calculateSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}