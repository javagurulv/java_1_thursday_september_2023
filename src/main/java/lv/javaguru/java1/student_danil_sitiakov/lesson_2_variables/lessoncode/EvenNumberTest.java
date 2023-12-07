package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class EvenNumberTest {



    public static void main(String[] args) {
        EvenNumberTest test = new EvenNumberTest();
        test.testCase1();
        test.testCase2();
    }

    private void testCase2() {
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(5);
        if (result == false) {
            System.out.println("Test case2 = ok");
        } else {
            System.out.println("test case2 = fail");
        }
    }

    public void testCase1() {
        EvenNumber evenNumber = new EvenNumber();
        boolean result = evenNumber.isEven(4);
        if (result == true) {
            System.out.println("Test case1 = ok");
        } else {
            System.out.println("test case 1 = fail");
        }
    }
}
