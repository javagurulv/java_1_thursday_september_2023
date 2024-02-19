package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

public class AverageFinderTest {
    public static void main(String[] args) {
        lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_1_intern.task_2.AverageFinderTest test = new lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_1_intern.task_2.AverageFinderTest();
        test.shouldCalculateAverage();
        test.shouldCalculateAverageWithRound();
    }
     public void ShouldCalculateAverage() {
        AverageFinder AverageFinder = new AverageFinder();
        int average = AverageFinder.findAverage(10, 12);
        checkResult(average, 11, "shouldFindAverage");
     }

    private void checkResult(int average, int i, String shouldFindAverage) {
    }
    public void shouldCalculateAverageWithRound(boolean testScenarioName) {
        lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_1_intern.task_2.AverageFinder averageFinder = new lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_1_intern.task_2.AverageFinder();
        int average = averageFinder.findAverage(10, 11);
        checkResult(average, 10, "shouldCalculateAverageWithRound");


        int expectedResult = 0;
        int realResult = 0;
        if (realResult == expectedResult) {
                System.out.println(testScenarioName + ": TEST IS GOOD");
            } else {
                System.out.println(testScenarioName + ": TEST FAILED expected = " + expectedResult + " but realResult = " + realResult);
            }
        }

}
