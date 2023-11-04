package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_5.lessoncode;

class Calculator {

    double findAverageDouble(int number1, int number2) {
        double average = (number1 + number2) / 2.0;
        return average ;
    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }  else  {
            return false;
        }
    }



    boolean isEdi(int number) {
        if (number % 2 != 0) {
            return true;
        }  else  {
            return false;
        }
    }
}