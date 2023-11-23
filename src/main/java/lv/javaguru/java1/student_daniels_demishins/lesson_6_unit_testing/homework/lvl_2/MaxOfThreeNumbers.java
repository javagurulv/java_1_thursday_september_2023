package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_2;

class MaxOfThreeNumbers {
    public int findMax(int num1, int num2, int num3) {
        return num3 > num2 && num3 > num1 ? num3 : num1;
    }
}
