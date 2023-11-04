package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.lessoncode;

class MaxNumber {
    int findMax(int number1, int number2, int number3) {
        int max = number1 > number2 ? number1 : number2;
        max = max > number3 ? max : number3;
        return max;
    }

    int findMaxV2(int number1, int number2, int number3) {
        int max = findMax(number1,number2);
        max = findMax(max,number3);
        return max;
    }

    int findMaxV3(int number1, int number2, int number3) {
        int max = findMax(number1,number2);
        return findMax(max,number3);
    }
    int findMaxV4(int number1, int number2, int number3) {

        return findMax(findMax(number1,number2),number3);
    }


    int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    int findMaxShortVersion(int number1, int number2) {
        return number1 > number2 ? number1 : number2;

    }


}
