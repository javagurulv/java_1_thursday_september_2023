package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.homework.level2;

class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.testCase1();
        test.testCase2();


    }

    public void testCase1() {
        MaxOfThreeNumbers maxNumber = new MaxOfThreeNumbers();
        int result = maxNumber.findMax(4, 3, 7);
        if (result == 7) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void testCase2() {
        MaxOfThreeNumbers maxNumber = new MaxOfThreeNumbers();
        int result = maxNumber.findMax(9, 1, 266);
        if (result == 266) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }

}

