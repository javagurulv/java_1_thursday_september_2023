package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class MaxNumber {

    int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    int findMaxShorVersion(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

}
