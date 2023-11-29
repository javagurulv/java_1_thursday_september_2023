package lv.javaguru.java1.student_andrejs_picilevics.lesson_6.lessoncode;

public class MaxNumber {

        //test case1: 6, 4; expected result  6
        //test case2: 2, 10; expected result  10
        //test case2: 2, 2; expected result  2

    public int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
