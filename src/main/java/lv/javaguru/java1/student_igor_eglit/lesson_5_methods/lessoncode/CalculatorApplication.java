package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.lessoncode;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        //boolean result = calculator.isEven(4); или сразу так
        System.out.println("4 = "+ calculator.isEven(4));
        System.out.println("5 = "+ calculator.isEven(5));
        System.out.println("6 = "+ calculator.isEven(6));
        System.out.println("7 = "+ calculator.isEven(7));
        System.out.println("8 = "+ calculator.isEven(8));
        System.out.println();
        System.out.println("4 = "+ calculator.isOdd(4));
        System.out.println("5 = "+ calculator.isOdd(5));
        System.out.println("6 = "+ calculator.isOdd(6));
        System.out.println("7 = "+ calculator.isOdd(7));
        System.out.println("8 = "+ calculator.isOdd(8));
    }
}
