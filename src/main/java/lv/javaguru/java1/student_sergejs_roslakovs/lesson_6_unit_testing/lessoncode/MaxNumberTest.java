package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.lessoncode;

class MaxNumberTest {

    public static void main(String[] args) {
        MaxNumberTest test = new MaxNumberTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();

    }
    public void testCase1() {
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(8, 5);
        if (result == 8) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

        public void testCase2 () {
            MaxNumber maxNumber = new MaxNumber();
            int result = maxNumber.findMax(2, 10);
            if (result == 10) {
                System.out.println("Test 2 = OK");
            } else {
                System.out.println("Test 2 = FAIL");
            }
        }

        public void testCase3 () {
            MaxNumber maxNumber = new MaxNumber();
            int result = maxNumber.findMax(2, 2);
            if (result == 2) {
                System.out.println("Test 3 = OK");
            } else {
                System.out.println("Test 3 = FAIL");
            }

        }
    }







