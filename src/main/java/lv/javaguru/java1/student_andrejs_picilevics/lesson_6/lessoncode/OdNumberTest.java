package lv.javaguru.java1.student_andrejs_picilevics.lesson_6.lessoncode;

public class OdNumberTest {

    public static void main(String[] args) {

        OdNumberTest test2 = new OdNumberTest();
        test2.testCase1();
        test2.testCase2();
    }
    //case 1: number = 7; expected result = true
    //case 2: number = 2; expected result = false



    public void testCase1(){
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(7);
        if (result == true) {
            System.out.println("Test case 1 = ok");
        } else {
            System.out.println("Test case 1 = Fail");
        }
    }

    public void testCase2(){
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(2);
        if (result == false) {
            System.out.println("Test case 2 = ok");
        } else {
            System.out.println("Test case 2 = Fail");
        }
    }
}
