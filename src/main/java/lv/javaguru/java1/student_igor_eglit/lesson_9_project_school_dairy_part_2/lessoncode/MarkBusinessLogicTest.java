package lv.javaguru.java1.student_igor_eglit.lesson_9_project_school_dairy_part_2.lessoncode;

public class MarkBusinessLogicTest {

    public static void main(String[] args) {
        MarkBusinessLogicTest test = new MarkBusinessLogicTest();
        test.testCase1();
        test.testCase2();
        test.testCase3();
        test.testCase4();
    }

    public void testCase1() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Math", 8);
        bl.addMark("Math", 10);
        int maxMark = bl.findMaxMark("Math");
        if (maxMark == 10) {
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FAIL");
        }
    }

    public void testCase2() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        bl.addMark("LV", 10);
        int maxMark = bl.findMaxMark("Eng");
        if (maxMark == 8) {
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }

    public void testCase3() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        int maxMark = bl.findMaxMark("Math");
        if (maxMark == 0) {
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }

    public void testCase4() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        int maxMark = bl.findMaxMark("LV");
        if (maxMark == 0) {
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }

}
