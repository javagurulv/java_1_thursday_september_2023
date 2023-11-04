package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.lessoncode;

class MaxNumber {
    int findMax(int number1, int number2) {
        return number1 > number2 ? number1 : number2;
    }

    int findMax3(int number1, int number2, int number3) {
        int max = number1 > number2 ? number1 : number2;
        max = max > number3 ? max : number3;
        return max;
    }

    int findMax3V2(int number1, int number2, int number3) {
        int max = findMax(number1, number2);
        return findMax(max, number3);
    }

    int findMax3V3(int number1, int number2, int number3) {
        return findMax(findMax(number1, number2), number3);
    }
}

