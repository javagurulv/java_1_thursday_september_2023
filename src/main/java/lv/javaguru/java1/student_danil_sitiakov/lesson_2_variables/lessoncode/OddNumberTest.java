package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class OddNumberTest {
    public static void main(String[] args) {
        OddNumberTest test = new OddNumberTest();
        test.testCase1();
        test.testCase2();
    }
    //test Number1 =
    //test Number2 =

    private void testCase2() {
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(5);
        if (result == true) {
            System.out.println("Test case2 = ok");
        } else {
            System.out.println("test case2 = fail");
        }
    }
    private void testCase1() {
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(4);
        if (result == false) {
            System.out.println("Test case1 = ok");
        } else {
            System.out.println("test case1 = fail");
        }
    }





}
