package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl2;

class MaxOfThreeNumbers {

    //testcase1 : 3, 6, 9; expected result : 9
    //testcase1 : 10, 6, 4; expected result : 10


    public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, num3);
    }

}
