package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class MaxOfTwoNumbers {

    // 1. num1 = 12, num2 = 10; result = 12
    // 2. num1 = 5, num2 = 8; result = 8
    // 3. num1 = 5, num2 = 5; result = 5

    public int max(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else {
            return number2;
        }
    }

}
