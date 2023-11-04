package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.lessoncode;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(4);
        System.out.println("4 = " + calculator.isEven(4));
        System.out.println("5 = " + calculator.isEven(5));
        System.out.println("6 = " + calculator.isEven(6));
        System.out.println("7 = " + calculator.isEven(7));

        System.out.println("4 = " + calculator.isOdd(4));
        System.out.println("5 = " + calculator.isOdd(5));
        System.out.println("6 = " + calculator.isOdd(6));
        System.out.println("7 = " + calculator.isOdd(7));

        System.out.println("4-4 = " + calculator.findAverage(4, 4));
        System.out.println("5-4 = " + calculator.findAverage(5, 4));
        System.out.println("6-8 = " + calculator.findAverage(6, 8));
        System.out.println("7-9 = " + calculator.findAverage(7, 9));

        System.out.println("5-4 = " + calculator.findAverageDouble(5, 4));
    }
}
