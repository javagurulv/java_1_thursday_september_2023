package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson6;
// TestCase 1: 6 + 4 / 2 = 5
// TestCase 2: 0 + 0 / 2 = 0


public class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinder test = new AverageFinder();
        test.test1();
        test.test2();
    }

    public void test1() {
        AverageFinder averageFinder = new AverageFinder();
        int result = averageFinder.findAverage(6, 4);
        checkResult(result,5, "test1");
    }
    public void test2() {
        AverageFinder averageFinder = new AverageFinder();
        int result = averageFinder.findAverage(6, 5);
        checkResult(result, 6, "test2");

}

    private void checkResult(int realResult,
                             int expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}




