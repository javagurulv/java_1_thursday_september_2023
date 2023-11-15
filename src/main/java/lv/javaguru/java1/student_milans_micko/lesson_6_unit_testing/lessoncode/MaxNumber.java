package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.lessoncode;

class MaxNumber {

    //test case 1: 6, 4; expected result = 6
    //test case 2: 2, 10; expected result = 10
    //test case 3: 2, 2; expected result = 2

    public int findMax(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
