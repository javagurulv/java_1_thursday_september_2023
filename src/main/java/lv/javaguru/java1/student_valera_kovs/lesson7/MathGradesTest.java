package lv.javaguru.java1.student_valera_kovs.lesson7;

class MathGradesTest {

    private static int[] getGrades() {
        return new int[]{5, 8, 7, 9, 6, 8, 3};
    }

    private static float referenceAverageGradesFinder(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (float) sum / grades.length;
    }

    public void testAverageGrade() {
        MathGrades test = new MathGrades();
        float referenceAverageGrade = referenceAverageGradesFinder(getGrades());
        float averageMathExamGrade = test.findAverageMathGrade(getGrades());
        String result = averageMathExamGrade == referenceAverageGrade ? "Test average grade = OK" : "Test average grade = Failed";
        System.out.println(referenceAverageGrade + " -- " + averageMathExamGrade);
        System.out.println(result);
    }

    public static void main(String[] args) {
        MathGradesTest mathGradesTest = new MathGradesTest();
        mathGradesTest.testAverageGrade();
    }
}
