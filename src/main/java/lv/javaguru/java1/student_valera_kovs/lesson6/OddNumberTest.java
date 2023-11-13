package lv.javaguru.java1.student_valera_kovs.lesson6;

public class OddNumberTest {

    public static void main(String[] args) {
        OddNumberTest oddNumberTest = new OddNumberTest();
        oddNumberTest.testCase1();
        oddNumberTest.testCase2();

    }


    public void testCase1() {
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(7);
        if (result) {
            System.out.println("TEST CASE 1 = OK");
        } else {
            System.out.println("TEST CASE 1 = FAIL");
        }

    }

    public void testCase2() {
        OddNumber oddNumber = new OddNumber();
        boolean result = oddNumber.isOdd(2);
        if (!result) {
            System.out.println("TEST CASE 2 = OK");
        } else {
            System.out.println("TEST CASE 2 = FAIL");
        }
    }
}
