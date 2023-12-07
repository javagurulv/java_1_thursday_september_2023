package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class Calculator {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    boolean is0dd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
     double findAverageDouble(int number1, int number2) {
        double average = (number1 + number2) / 2.0;
        return average;
     }
     int findAverage(int number1, int number2) {
        int average = (number1 + number2) / 2;
        return average;
     }
}
