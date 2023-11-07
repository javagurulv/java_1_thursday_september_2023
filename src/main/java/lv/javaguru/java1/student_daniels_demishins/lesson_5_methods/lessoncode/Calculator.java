package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.lessoncode;

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

    int findAverage(int num1, int num2) {
        int average = (num1 + num2) / 2;
        return average;
    }

    double findAverageDouble(double num1, double num2) {
        double average = (num1 + num2) / 2;
        return average;
    }

    int maxNumbers ( int num1 ,int num2 ) {
        if( num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    int maxNumbersShort (int num1 , int num2){
        return num1> num2 ? num1 : num2;
    }

    int maxThreeNumbers( int num1, int num2, int num3){
        int max = num1 > num2 ? num1: num2;
        max = max > num3 ? max : num3;
        return max;
    }
}
