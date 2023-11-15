package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl1;

public class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.testcase1();
        averageFinderTest.testcase2();
    }

    public void testcase1() {
        AverageFinder averageFinder = new AverageFinder();
        int result = averageFinder.findAverage(3,7);
        if (result == 5) {
            System.out.println("Test 1 is OK");
        } else {
            System.out.println("Test 1 is FALSE");
        }
    }

    public void testcase2() {
        AverageFinder averageFinder = new AverageFinder();
        int result = averageFinder.findAverage(5,9);
        if (result == 7) {
            System.out.println("Test 2 is OK");
        } else {
            System.out.println("Test 2 is FALSE");
        }
    }
}
