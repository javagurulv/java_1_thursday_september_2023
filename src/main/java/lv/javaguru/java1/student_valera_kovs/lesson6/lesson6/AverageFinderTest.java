package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6;


public class AverageFinderTest {

    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.testCase1();
        averageFinderTest.testCase2();

    }
    public void testCase1(){
        AverageFinder averageFinder = new AverageFinder();
        int testResult = averageFinder.findAverage(2,6);
        if (testResult==4) {
            System.out.println("TestCase1 OK");
        }else {
            System.out.println("TestCase1 Fail");
            System.out.println(testResult +": result 2.6");
        }

    }
    public void testCase2(){
        AverageFinder averageFinder = new AverageFinder();
        int testResult = averageFinder.findAverage(6,9);
        if (testResult==7) {
            System.out.println("TestCase2 OK");
        }else {
            System.out.println("TestCase2 Fail");
            System.out.println(testResult +": result 7");
        }

    }
}
