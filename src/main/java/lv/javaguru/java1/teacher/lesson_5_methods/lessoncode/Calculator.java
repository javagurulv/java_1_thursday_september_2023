package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class Calculator {

    double findAverageDouble(int number1, int number2) {
        double average = (number1 + number2) / 2.0;
        return average;
    }

    int findAverage(int number1, int number2) {
       int average = (number1 + number2) / 2;
       return average;
    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

}
