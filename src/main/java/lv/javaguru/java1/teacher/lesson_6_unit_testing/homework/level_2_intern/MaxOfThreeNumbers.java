package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.level_2_intern;

class MaxOfThreeNumbers {

    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num2);
    }

}
