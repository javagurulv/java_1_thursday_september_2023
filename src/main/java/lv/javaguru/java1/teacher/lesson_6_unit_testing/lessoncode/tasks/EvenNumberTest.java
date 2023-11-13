package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode.tasks;

class EvenNumberTest {

    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.testCase1();
        test.testCase2();
    }

    // test case 1: input 4; expected result = true
    public void testCase1() {
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(4);
        if (result == true) {
            System.out.println("TEST CASE 1 = OK");
        } else {
            System.out.println("TEST CASE 1 = FAIL");
        }
    }

    // test case 2: input 9; expected result = false
    public void testCase2() {
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(9);
        if (result == false) {
            System.out.println("TEST CASE 2 = OK");
        } else {
            System.out.println("TEST CASE 2 = FAIL");
        }
    }






}
