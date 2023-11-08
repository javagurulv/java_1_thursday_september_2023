package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.lessoncode;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("4 = " + calculator.isEven(4));
        System.out.println("5 = " + calculator.isEven(5));

        System.out.println("4 = " + calculator.isOdd(4));
        System.out.println("5 = " + calculator.isOdd(5));

        System.out.println("average is "+calculator.findAverage(5,5));
        System.out.println("average double is "+calculator.findAverageDouble(5.4,4.3));

        System.out.println("max of 2 is "+calculator.maxNumbers(8,5));
        System.out.println("short max of 2 is "+calculator.maxNumbersShort(8,5));
        System.out.println("short max of 3 is "+calculator.maxThreeNumbers(5,7,6));


    }
}
