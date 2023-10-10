package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode;

public class CalculatorFigures {
    public static void main(String[] args){

        int number1 = 1000;
        int number2 = 200;

        int sumResult = number1 + number2;
        int minusResult = number1 - number2;
        int multiplyResult = number1 * number2;
        int divisionResult = number1 / number2;

        System.out.println("Result + = " + sumResult);
        System.out.println("Result - = " + minusResult);
        System.out.println("Result * = " + multiplyResult);
        System.out.println("Result / = " + divisionResult);
    }
}
