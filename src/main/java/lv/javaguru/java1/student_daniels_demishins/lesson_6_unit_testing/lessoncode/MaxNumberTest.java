package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.lessoncode;

public class MaxNumberTest {
    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.isNum1Max();
        test.isNum2Max();
        test.isNumEqual();
    }


    void isNum1Max() {
        MaxNumber MaxNumber = new MaxNumber();
        int expectedResult = MaxNumber.findMax(5,4);
        if (expectedResult == 5) {
            System.out.println("Test Num 1 is OK");
        } else {
            System.out.println("Test Num 1 FAIL");
        }
    }

    void isNum2Max() {
        MaxNumber MaxNumber = new MaxNumber();
        int expectedResult = MaxNumber.findMax(4,5);
        if (expectedResult == 5) {
            System.out.println("Test Num 2 is OK");
        } else {
            System.out.println("Test Num 2 FAIL");
        }
    }


    void  isNumEqual() {
        MaxNumber MaxNumber = new MaxNumber();
        int expectedResult = MaxNumber.findMax(4,4);
        if (expectedResult == 4) {
            System.out.println("Test Num Equal is OK");
        } else {
            System.out.println("Test Num Equal FAIL");
        }
    }



}
