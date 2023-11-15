package lv.javaguru.java1.student_milans_micko.lesson_5_methods.lessoncode;

class MaxNumber {

    int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

    //int shortFindMax(int number1, int number2) {
        //return number1 > number2
                //? number1
                //: number2;
    //}

    int findMaxOfThree(int number1, int number2, int number3) {
        int max = findMax(number1, number2);
        max = findMax(max, number3);
        return max;
    }


}
