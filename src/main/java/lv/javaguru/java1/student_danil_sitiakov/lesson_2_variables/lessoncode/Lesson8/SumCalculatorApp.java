package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson8;

import lv.javaguru.java1.teacher.lesson_2_variables.lessoncode.Calculator;

public class SumCalculatorApp {
    public static void main(String [] args){

        SumCalculator calculator = new SumCalculator();
        int sum = calculator.CalculateSum(1,10);
        System.out.println(sum);

    }
}
