package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_1_intern;
/*
case 1: num1 = 2, num2 = 8 : expected result = 5;
case 2: num1 = 4, num2 = 5 : expected result = 4.5

case 1: num1 = 2, num2 = 8 : expected result = 5 - OK
case 2: num1 = 4, num2 = 5 : expected result = 4.5  - real  result = 4
    class AverageFinder
    public INT findAverage(int num1, int num2) {
        INT sum = num1 + num2;
        return sum / 2;

        public DOUBLE findAverage(int num1, int num2) {
        DOUBLE sum = num1 + num2;
        return sum / 2.0;
    }
 */
class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.testCase1();
        averageFinderTest.testCase2();

    }
    public void testCase1(){
        AverageFinder averageFinder = new AverageFinder();
        double testResult = averageFinder.findAverage(2,8);
        if (testResult==5) {
            System.out.println("Test Case1 num1 = 2, num2 = 8:  OK");
        }else {
            System.out.println("Test Case1 num1 = 2, num2 = 8:  Fail");
        }

    }
    public void testCase2(){
        AverageFinder averageFinder = new AverageFinder();
        double testResult = averageFinder.findAverage(4,5);
        if (testResult==4.5) {
            System.out.println("Test Case1 num1 = 4, num2 = 5:  OK");
        }else {
            System.out.println("Test Case1 num1 = 4, num2 = 5:  Fail");
            System.out.println(testResult +": expected result 4.5");
        }

    }
}
