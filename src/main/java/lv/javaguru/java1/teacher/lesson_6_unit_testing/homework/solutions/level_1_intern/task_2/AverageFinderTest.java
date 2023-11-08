package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_1_intern.task_2;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest test = new AverageFinderTest();
        test.shouldCalculateAverage();
        test.shouldCalculateAverageWithRound();
    }

    public void shouldCalculateAverage() {
        AverageFinder averageFinder = new AverageFinder();
        int average = averageFinder.findAverage(10, 12);
        checkResult(average, 11, "shouldCalculateAverage");
    }

    public void shouldCalculateAverageWithRound() {
        AverageFinder averageFinder = new AverageFinder();
        int average = averageFinder.findAverage(10, 11);
        checkResult(average, 10, "shouldCalculateAverageWithRound");
    }
    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
