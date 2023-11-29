package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.lessoncode;


class MarkBusinessLogicTest {

    public static void main(String[] args) {
        MarkBusinessLogicTest test = new MarkBusinessLogicTest();
        test.testMaxMarkCase1();
        test.testMaxMarkCase2();
        test.testMaxMarkCase3();
        test.testMaxMarkCase4();
        test.testMinMarkCase1();
        test.testMinMarkCase2();
        test.testMinMarkCase3();
        test.testMinMarkCase4();
        test.testFindAverageSubjectMark1();
        test.testFindAverageSubjectMark2();
        test.testFindAverageSubjectMark3();
        test.testFindAverageSubjectMark4();
        test.testFindAverageMark1();
        test.testFindAverageMark2();
        test.testFindAverageMark3();
    }

    public void testMaxMarkCase1() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Math", 8);
        bl.addMark("Math", 10);
        int maxMark = bl.findMaxMark("Math");
        if (maxMark == 10) {
            System.out.println("TEST maxMark 1 = OK");
        } else {
            System.out.println("TEST MaxMark 1 = FAIL");
        }
    }

    public void testMaxMarkCase2() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        bl.addMark("LV", 10);
        int maxMark = bl.findMaxMark("Eng");
        if (maxMark == 8) {
            System.out.println("TEST maxMark 2 = OK");
        } else {
            System.out.println("TEST maxMark 2 = FAIL");
        }
    }

    public void testMaxMarkCase3() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        int maxMark = bl.findMaxMark("Math");
        if (maxMark == 0) {
            System.out.println("TEST maxMark 3 = OK");
        } else {
            System.out.println("TEST maxMark 3 = FAIL");
        }
    }

    public void testMaxMarkCase4() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        int maxMark = bl.findMaxMark("LV");
        if (maxMark == 0) {
            System.out.println("TEST maxMark 4 = OK");
        } else {
            System.out.println("TEST maxMark 4 = FAIL");
        }
    }

    public void testMinMarkCase1() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Math", 8);
        bl.addMark("Math", 10);
        int minMark = bl.findMinMark("Math");
        if (minMark == 2) {
            System.out.println("TEST minMark 1 = OK");
        } else {
            System.out.println("TEST minMark 1 = FAIL");
        }
    }

    public void testMinMarkCase2() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        bl.addMark("LV", 10);
        int minMark = bl.findMinMark("Eng");
        if (minMark == 8) {
            System.out.println("TEST minMark 2 = OK");
        } else {
            System.out.println("TEST minMark 2 = FAIL");
        }
    }

    public void testMinMarkCase3() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        int minMark = bl.findMinMark("Math");
        if (minMark == 0) {
            System.out.println("TEST minMark 3 = OK");
        } else {
            System.out.println("TEST minMark 3 = FAIL");
        }
    }

    public void testMinMarkCase4() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        int minMark = bl.findMinMark("LV");
        if (minMark == 0) {
            System.out.println("TEST minMark 4 = OK");
        } else {
            System.out.println("TEST minMark 4 = FAIL");
        }
    }

    public void testFindAverageSubjectMark1() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Math", 8);
        bl.addMark("Math", 10);
        float averageSubjectMark = bl.findAverageSubjectMark("Math");
        if (averageSubjectMark == 6) {
            System.out.println("TEST FindAverageSubjectMark1 = OK");
        } else {
            System.out.println("TEST FindAverageSubjectMark1 = FAIL");
        }
    }

    public void testFindAverageSubjectMark2() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        bl.addMark("LV", 10);
        float averageSubjectMark = bl.findAverageSubjectMark("Eng");
        if (averageSubjectMark == 8) {
            System.out.println("TEST FindAverageSubjectMark2 = OK");
        } else {
            System.out.println("TEST FindAverageSubjectMark2 = FAIL");
        }
    }

    public void testFindAverageSubjectMark3() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        float averageSubjectMark = bl.findAverageSubjectMark("Math");
        if (averageSubjectMark == 0) {
            System.out.println("TEST FindAverageSubjectMark3 = OK");
        } else {
            System.out.println("TEST FindAverageSubjectMark3 = FAIL");
        }
    }

    public void testFindAverageSubjectMark4() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        float averageSubjectMark = bl.findAverageSubjectMark("LV");
        if (averageSubjectMark == 0) {
            System.out.println("TEST FindAverageSubjectMark4 = OK");
        } else {
            System.out.println("TEST FindAverageSubjectMark4 = FAIL");
        }
    }

    public void testFindAverageMark1() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Math", 8);
        bl.addMark("Math", 10);
        float averageMark = bl.findAverageMark();
        if (averageMark == 6) {
            System.out.println("TEST FindAverageMark1 = OK");
        } else {
            System.out.println("TEST FindAverageMark1 = FAIL");
        }
    }

    public void testFindAverageMark2() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        bl.addMark("Math", 2);
        bl.addMark("Eng", 8);
        bl.addMark("LV", 10);
        float averageMark = bl.findAverageMark();
        if (averageMark == 6) {
            System.out.println("TEST FindAverageMark2 = OK");
        } else {
            System.out.println("TEST FindAverageMark2 = FAIL");
        }
    }

    public void testFindAverageMark3() {
        MarkBusinessLogic bl = new MarkBusinessLogic();
        float averageMark = bl.findAverageMark();
        if (averageMark == 0) {
            System.out.println("TEST FindAverageMark3 = OK");
        } else {
            System.out.println("TEST FindAverageMark3 = FAIL");
        }
    }
}
