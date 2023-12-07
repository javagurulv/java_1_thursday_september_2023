package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class CalculatorApplication {
    public static void main(String [] args){
        Calculator calculator = new Calculator();
        //boolean result = calculator.isEven(4);
        System.out.println("4 =" + calculator.isEven(4));
        System.out.println("5 =" + calculator.isEven(5));
        System.out.println("6 =" + calculator.isEven(6));
        System.out.println("7 =" + calculator.isEven(7));

        System.out.println("8 =" + calculator.is0dd(8));
        System.out.println("9 =" + calculator.is0dd(9));
        System.out.println("10 =" + calculator.is0dd(10));
        System.out.println("11 =" + calculator.is0dd(11));

    }

 }
