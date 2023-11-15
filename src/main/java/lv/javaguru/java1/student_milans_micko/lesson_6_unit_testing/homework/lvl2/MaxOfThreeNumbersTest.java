package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl2;

public class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest maxOfThreeNumbersTest = new MaxOfThreeNumbersTest();
        maxOfThreeNumbersTest.testcase1();
        maxOfThreeNumbersTest.testcase2();
    }

    //testcase1 : 3, 6, 9; expected result : 9
    public void testcase1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(3,6,9);
        if (result == 9) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FALSE");
        }
    }

    //testcase1 : 10, 6, 4; expected result : 10
    public void testcase2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(10,6,4);
        if (result == 10) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is FALSE");
        }
    }

}
