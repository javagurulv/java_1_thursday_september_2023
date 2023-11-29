package lv.javaguru.java1.student_andrejs_picilevics.lesson_6.lessoncode;

class EvenNumberTest {

    public static void main(String[] args) {

        EvenNumberTest test = new EvenNumberTest();
        test.testCase1();
        test.testCase2();
    }

    //test case 1
    public void testCase1() {
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(4);
        if (result == true) {
            System.out.println("Test case 1 = ok");
        } else {
            System.out.println("Test case 1 = Fail");
        }
    }

    //test Case 2
    public void testCase2() {
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(9);
        if (result == false) {
            System.out.println("Test case 2 = ok");
        } else {
            System.out.println("Test case 2 = Fail");
        }
    }
}
