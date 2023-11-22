package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_7;

public class CompoundInterestTest {
    public static void main(String[] args) {
        CompoundInterestTest compoundInterestTest = new CompoundInterestTest();
        compoundInterestTest.testCase1();
        compoundInterestTest.testCase2();
        compoundInterestTest.testCase3();
        compoundInterestTest.testCase4();

    }

    // Test Case 1 =  Sum = 50000 , Interest = 10 , Years = 30"
    void testCase1(){
        CompoundInterest compoundInterest = new CompoundInterest();
        double interest = compoundInterest.compoundInterest(50000,10,30);
        checkResult(interest, 872470.1134443224,"Test Case 1 : Sum = 50000 , Interest = 10 , Years = 30   ");
    }

    // Test Case 2 : Sum = 0 , Interest = 10 , Years = 30
    void testCase2(){
        CompoundInterest compoundInterest = new CompoundInterest();
        double interest = compoundInterest.compoundInterest(0,10,30);
        checkResult(interest, 0.0,"Test Case 2 : Sum = 0 , Interest = 10 , Years = 30   ");
    }

    // Test Case 3 : Sum = 50000 , Interest = 0 , Years = 30
    void testCase3(){
        CompoundInterest compoundInterest = new CompoundInterest();
        double interest = compoundInterest.compoundInterest(50000,0,30);
        checkResult(interest, 50000.0,"Test Case 3 : Sum = 50000 , Interest = 0 , Years = 30   ");
    }

    // Test Case 4 : Sum = 50000 , Interest = 10 , Years = 0
    void testCase4(){
        CompoundInterest compoundInterest = new CompoundInterest();
        double interest = compoundInterest.compoundInterest(50000,10,0);
        checkResult(interest, 50000.0,"Test Case 4 : Sum = 50000 , Interest = 10 , Years = 0   ");
    }


    void checkResult(double result, double expectedResult, String testname) {
        if (result == expectedResult) {
            System.out.println(testname + "OK");
        } else {
            System.out.println(testname + " Fail! Expected = " + expectedResult + " bur result = " + result);
        }
    }


}
