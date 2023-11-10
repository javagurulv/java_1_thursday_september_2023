package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_2_intern;
/*
Test Case1 : num1 = 3, num2 = 4, num3 = 6 : expected result = 6;
Test Case2 : num1 = -3, num2 = 4, num3 = 6 : expected result = 6;

Test Case1 : num1 = 3, num2 = 4, num3 = 6 : expected result = 6; - FAIL - real result 4
Test Case2 : num1 = -3, num2 = 4, num3 = 6 : expected result = 6; - FAIL - real result 4

 public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, NUM2);

         public int findMax(int num1, int num2, int num3) {
        int max = Math.max(num1, num2);
        return Math.max(max, NUM3);
    }
    }
 */

public class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest maxOfThreeNumbersTest = new MaxOfThreeNumbersTest();
        maxOfThreeNumbersTest.testCase1();
        maxOfThreeNumbersTest.testCase2();
    }

    public void testCase1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(3, 4, 6);
        if (result == 6) {
            System.out.println("Test Case1 : num1 = 3, num2 = 4, num3 = 6 : expected result = 6 - OK");
        } else {
            System.out.println("Test Case1 : num1 = 3, num2 = 4, num3 = 6 : expected result = 6 - Fail");
        }

    }

    public void testCase2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int result = maxOfThreeNumbers.findMax(-3, 4, 6);
        if (result == 6) {
            System.out.println("Test Case1 : num1 = -3, num2 = 4, num3 = 6 : expected result = 6 - OK");
        } else {
            System.out.println("Test Case1 : num1 = -3, num2 = 4, num3 = 6 : expected result = 6 - Fail");
        }

    }

}

