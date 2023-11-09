package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.lessoncode;

class MaxNumberTest {
    public static void main(String[] args) {
        MaxNumberTest maxNumberTest = new MaxNumberTest();
        maxNumberTest.testCase1();
        maxNumberTest.testCase2();
    }
    //test case 1 number 1 =4, number 2 = 5, expected result 5
    public void testCase1(){
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(4,5);
        if (result == 5) {
            System.out.println("Test 1 = OK");
        }else {
            System.out.println("Test 1 = FAIL");
        }
    }
    //test case 1 number 1 =8, number 2 = 2, expected result 8
    public void testCase2(){
        MaxNumber maxNumber = new MaxNumber();
        int result = maxNumber.findMax(8,2);
        if (result == 8) {
            System.out.println("Test 2 = OK");
        }else {
            System.out.println("Test 2 = FAIL");
        }
    }
}
