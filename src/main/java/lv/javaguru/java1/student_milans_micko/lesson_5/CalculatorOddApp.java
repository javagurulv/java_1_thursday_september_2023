package lv.javaguru.java1.student_milans_micko.lesson_5;

public class CalculatorOddApp {

    public static void main(String[] args) {
        CalculatorOdd calculatorOdd = new CalculatorOdd();
        boolean result = calculatorOdd.isOdd(4);
        System.out.println("4 " + calculatorOdd.isOdd(4));
        System.out.println("5 " + calculatorOdd.isOdd(5));
        System.out.println("6 " + calculatorOdd.isOdd(6));
        System.out.println("7 " + calculatorOdd.isOdd(7));
    }
}
