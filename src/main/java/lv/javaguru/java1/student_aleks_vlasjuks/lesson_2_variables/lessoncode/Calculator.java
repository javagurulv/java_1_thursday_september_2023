package lv.javaguru.java1.student_aleks_vlasjuks.lesson_2_variables.lessoncode;

public class Calculator {
    public static void main(String[] args) {
        //zadatj chisla
        int number1 = 12132;
        int number2 = 777999;

        int additionResult = number1 + number2;
        int subtractionResult = number1 - number2;
        double divisionResult = (double) number1 / number2;
        int multiplicationResult = number1 * number2;

        System.out.println("Result = " + additionResult);
        System.out.println("Result = " + subtractionResult);
        System.out.println("Result = " + divisionResult);
        System.out.println("Result = " + multiplicationResult);
    }
}

