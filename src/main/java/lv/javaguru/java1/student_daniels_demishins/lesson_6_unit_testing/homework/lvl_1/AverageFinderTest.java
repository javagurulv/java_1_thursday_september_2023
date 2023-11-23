package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_1;

class AverageFinderTest {
    public static void main(String[] args) {
        AverageFinderTest averageFinderTest = new AverageFinderTest();
        averageFinderTest.findAverageV1();
        averageFinderTest.findAverageV2();

    }

    void findAverageV1() {
        AverageFinder averageFinder = new AverageFinder();
        int result = averageFinder.findAverage(5,7);
        checkResult(result,6,"Find Average ");
    }


    void findAverageV2(){
        AverageFinder averageFinder = new AverageFinder();
        int result= averageFinder.findAverage(5,7);
        if(result == 6){
            System.out.println("Find Average test Ok");
        } else {
            System.out.println("Find Average test FAIL");
        }
    }


    void checkResult( int result, int expectedResult, String testname){
        if(result== expectedResult){
            System.out.println(testname+" is Ok");
        } else {
            System.out.println(testname+" Fail expected = "+expectedResult+" but "+result);
        }
    }

}
