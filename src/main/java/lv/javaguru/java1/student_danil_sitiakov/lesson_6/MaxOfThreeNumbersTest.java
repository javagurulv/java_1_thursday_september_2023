package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

class MaxOfThreeNumbersTest {
    public static void main(String[] args) {
        MaxOfThreeNumbersTest maxOfThreeNumbersTest = new MaxOfThreeNumbersTest();
        maxOfThreeNumbersTest.testcase1();
        maxOfThreeNumbersTest.testcase1Version2();

    }

    // testcase1: 3 , 6 , 9 = expected result 9

    void testcase1() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int max = maxOfThreeNumbers.findMax(2, 4, 6);
        if (max == 6) {
            System.out.println("Test case 1 Ok");
        } else {
            System.out.println("Testcase 1 Fail ");
        }
    }

    // testcase2: 3,6,9 = expected result 9

    void testcase1Version2() {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int max = maxOfThreeNumbers.findMax(2, 4, 6);
        checkResult(max, 6, "Test case 2");
    }

    void checkResult(int result, int expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + " Ok");
        } else {
            System.out.println(testName + " Fail! Expected = " + expectedResult + " but real " + result);
        }
    }
}
