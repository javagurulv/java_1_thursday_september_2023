package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode.lessoncode;

public class SumCalculatorApp {

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        int sum1 = calculator.calculateSum(10, 200);
        int sum2 = calculator.calculateSumStep2(10, 200);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
