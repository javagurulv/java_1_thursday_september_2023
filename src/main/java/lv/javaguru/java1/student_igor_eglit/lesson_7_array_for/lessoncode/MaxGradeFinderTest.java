package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class MaxGradeFinderTest {
    private static int[] getGrades() {
    int[] studentsGrades = {3, 6, 8, 9, 5};
    return studentsGrades;
}
    public void testFindMax() {
        MaxGradeFinder testFindMaxGrade = new MaxGradeFinder();
        var studentsGrades = getGrades();
        int maxGrade = testFindMaxGrade.findMaxGrade(studentsGrades);
        String result1 = maxGrade == 9 ? "Test Maxgrade = 9 is OK" : "Test Maxgrade = 9 Failed";
        System.out.println(result1);
    }
    public void testFindMin() {
        MaxGradeFinder testFindMaxGrade = new MaxGradeFinder();
        var studentsGrades = getGrades();
        int minGrade = testFindMaxGrade.findMinGrade(studentsGrades);
        String result2 = minGrade == 3 ? "Test Mingrade = 3 is OK" : "Test Mingrade = 3 Failed";
        System.out.println(result2);
    }
    public static void main(String[] args) {
        MaxGradeFinderTest test = new MaxGradeFinderTest();
        test.testFindMax();
        test.testFindMin();
    }
}
