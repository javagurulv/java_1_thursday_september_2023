package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.homework.level1;

class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.testCase1();
        averageFinderTest.testCase2();


    }

    public void testCase1() {

        AverageFinder averageFinder = new AverageFinder();
        double testResult = averageFinder.findAverage(4, 6);
        if (testResult == 5) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }

    }

    public void testCase2() {

        AverageFinder averageFinder = new AverageFinder();
        double testResult = averageFinder.findAverage(5, 10);
        if (testResult == 7.5) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }
}

        /*
        The result of the average of two numbers
        can be equals to a fractional number.
        So int != OK
           double = OK


         */














