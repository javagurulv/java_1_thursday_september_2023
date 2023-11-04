package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.lessoncode;

class Calculator {
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

    int findAverage(int number1, int number2) {
        int average = (number1 + number2) / 2;
        return average;
    }
    double findAverageDouble(int number1, int number2) {
        double average = (number1 + number2) / 2D;
        return average;
    }



}
