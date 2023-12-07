package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

import lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.level_2.MaxNumber;

public class MaxNumberTest {
    public  static void main(String [] args) {
        MaxNumberTest test = new MaxNumberTest();

    }
    public void testCase1() {
        MaxNumber maxNumber = new MaxNumber();
        int expectedresult = maxNumber.findMax(6, 4);
        if (expectedresult ==6) {
            System.out.println("test 1 = ok");
        } else {
            System.out.println("test 1 fail");
        }
    }
    public void testCase2() {
        MaxNumber maxNumber = new MaxNumber();
        int expectedresult = maxNumber.findMax(2, 10);
        if (expectedresult ==10) {
            System.out.println("test 2 = ok");
        } else {
            System.out.println("test 2 fail");
        }
    }
    public void testCase3() {
        MaxNumber maxNumber = new MaxNumber();
        int expectedresult = maxNumber.findMax(2, 2);
        if (expectedresult ==2) {
            System.out.println("test 3 = ok");
        } else {
            System.out.println("test 3 fail");
        }
    }
}
