package lv.javaguru.java1.student_milans_micko.lesson_5;

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
    double findAverage(int number1, int number2) {
        double average = (number1 + number2) / 2.0;
        return average;
    }

}
