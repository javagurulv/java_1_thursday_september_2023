package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.testcase1();
        test.testcase2();
        test.testcase3();
     }

    //test case 1: 6, 4; expected result = 6

    public void testcase1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(6, 4);
        if (result == 6) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    //test case 2: 2, 10; expected result = 10

    public void testcase2() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(2, 10);
        if (result == 10) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }


    //test case 3: 2, 2; expected result = 2
    public void testcase3() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(2, 2);
        if (result == 2) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

}
