package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.lessoncode;

class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.testCase1();
        test.testCase2();
    }
    public void testCase1() {
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(9);
        if (result == true) {
            System.out.println("TEST CASE 1 = OK");
        } else {
            System.out.println("TEST CASE 1 = FAIL");
        }
    }
    public void testCase2() {
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(6);
        if (result == false) {
            System.out.println("TEST CASE 2 = OK");
        } else {
            System.out.println("TEST CASE 2 = FAIL");
        }
    }



}
