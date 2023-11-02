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
    }
}
