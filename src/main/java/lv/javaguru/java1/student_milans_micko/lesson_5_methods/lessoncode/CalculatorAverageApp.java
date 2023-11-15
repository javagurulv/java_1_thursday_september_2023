package lv.javaguru.java1.student_milans_micko.lesson_5_methods.lessoncode;

public class CalculatorAverageApp {
    public static void main(String[] args) {
        CalculatorAverage calculatorAverage = new CalculatorAverage();

        System.out.println("4-4 " + calculatorAverage.findAverage(4, 4 ));
        System.out.println("4-5 " + calculatorAverage.findAverage(4, 5 ));
        System.out.println("4-6 " + calculatorAverage.findAverage(4, 6 ));
        System.out.println("4-8 " + calculatorAverage.findAverage(4, 8 ));
    }
}
