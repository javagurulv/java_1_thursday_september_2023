package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_4_middle;

class PayRollStatCalcTest {
    public static void main(String[] args) {
        PayRollStatCalcTest payRollStatCalcTest = new PayRollStatCalcTest();
        payRollStatCalcTest.sumTotalSalaryTest();
        payRollStatCalcTest.findMinSalaryTest();
        payRollStatCalcTest.findMaxSalaryTest();
        payRollStatCalcTest.averageSalaryTest();
        payRollStatCalcTest.standardDeviationTest();
        payRollStatCalcTest.ratioStandDevToAverage();

    }

    public double[] createSalaryArray() {
        return new double[]{2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
    }
    private static void resultDisplay(double expectedResult, double realResult, String testName) {
        if (expectedResult == realResult) {
            System.out.println(testName + " confirmed, OK");
        }else {
            System.out.println(testName + " failed");
        }
    }
    public void sumTotalSalaryTest() {
        PayRollStatCalc payRollStatCalc = new PayRollStatCalc();
        double realResult = payRollStatCalc.sumTotalSalary(createSalaryArray());
        resultDisplay(14400.0, realResult, "Test sum of salaries");
    }
    private void findMinSalaryTest() {
        PayRollStatCalc payRollStatCalc = new PayRollStatCalc();
        double realResult = payRollStatCalc.findMinSalary(createSalaryArray());
        resultDisplay(1800.0, realResult, "Test find min salary");
    }

    private void findMaxSalaryTest() {
        PayRollStatCalc payRollStatCalc = new PayRollStatCalc();
        double realResult = payRollStatCalc.findMaxSalary(createSalaryArray());
        resultDisplay(4000.0, realResult, "Test find max salary");
    }
    private void averageSalaryTest() {
        PayRollStatCalc payRollStatCalc = new PayRollStatCalc();
        double realResult = payRollStatCalc.averageSalary(createSalaryArray());
        resultDisplay(2880.0, realResult, "Test find average salary level");
    }
    private  void standardDeviationTest(){
        PayRollStatCalc payRollStatCalc = new PayRollStatCalc();
       short realResult = payRollStatCalc.standardDeviation(createSalaryArray());
       resultDisplay(730,realResult,"Test Standard Deviation calculation");
    }
    private void ratioStandDevToAverage(){
        PayRollStatCalc payRollStatCalc = new PayRollStatCalc();
        System.out.println("\n"+"The ratio between the standard deviation and the average "+payRollStatCalc.ratioStandDevToAverage(createSalaryArray()));
    }
}
