package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.lessoncode;

class Calculator {
    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int number) {
        if (number % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
