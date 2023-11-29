package lv.javaguru.java1.student_andrejs_picilevics.lesson_6.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {

        MaxNumberTest test = new MaxNumberTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
    }

    //test case1: 6, 4; expected result  6

    public void testCase1() {
        MaxNumber maxNumber = new MaxNumber();
        int expectedResult = maxNumber.findMax(6, 4);
        if (expectedResult == 6) {
            System.out.println("Test 1 = ok");
        } else {
            System.out.println("Test 1 = fail");
        }
    }
    //test case2: 2, 10; expected result  10

    public void testCase2() {
        MaxNumber maxNumber = new MaxNumber();
        int expectedResult = maxNumber.findMax(2, 10);
        if (expectedResult == 10) {
            System.out.println("Test 1 = ok");
        } else {
            System.out.println("Test 1 = fail");
        }
    }

    //test case2: 2, 2; expected result  2

    public void testCase3() {
        MaxNumber maxNumber = new MaxNumber();
        int expectedResult = maxNumber.findMax(2, 2);
        if (expectedResult == 2) {
            System.out.println("Test 3 = ok");
        } else {
            System.out.println("Test 3 = fail");
        }
    }
}
