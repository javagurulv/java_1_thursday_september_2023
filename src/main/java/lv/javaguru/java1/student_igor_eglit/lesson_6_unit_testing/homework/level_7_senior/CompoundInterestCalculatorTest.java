package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_7_senior;

/*
Test Case       Sum      Interest      Years        Expected Result              Actual Result
id1           10000           4          10        14802.442849183444
id2             0             4          10           0
id3           10000           0          10         10000
id4           10000           4           0         10000

id1 :       10000 :         4 :           10 :      ER=14802.442849183444 - OK : AR = 14802.442849183444
id2 :           0 :         4 :           10 :      ER=0 - OK :                  AR = 0.0
id3 :       10000 :         0 :           10 :      ER=10000 - OK :              AR = 10000.0
id4 :       10000 :         4 :            0 :      ER=10000 - OK :              AR = 10000.0
 */
public class CompoundInterestCalculatorTest {
    public static void main(String[] args) {
        CompoundInterestCalculatorTest compoundInterestCalculatorTest = new CompoundInterestCalculatorTest();
    compoundInterestCalculatorTest.id1();
    compoundInterestCalculatorTest.id2();
    compoundInterestCalculatorTest.id3();
    compoundInterestCalculatorTest.id4();
    }

    public void id1() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(10000, 4, 10);
        System.out.println(result == 14802.442849183444 ? "id1 : 10000 : 4 : 10 : ER=14802.442849183444 - OK : AR = " + result :
                "id1 : 10000 : 4 : 10 : ER=14802.442849183444 - FAIL : AR = " + result);
    }
    public void id2() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(0, 4, 10);
        System.out.println(result == 0 ? "id2 : 0 : 4 : 10 : ER=0 - OK : AR = " + result :
                "id2 : 0 : 4 : 10 : ER=0 - FAIL : AR = " + result);
    }
    public void id3() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(10000, 0, 10);
        System.out.println(result == 10000 ? "id3 : 10000 : 0 : 10 : ER=10000 - OK : AR = " + result :
                "id3 : 10000 : 0 : 10 : ER=10000 - FAIL : AR = " + result);
    }
    public void id4() {
        CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
        double result = compoundInterestCalculator.compoundInterest(10000, 4, 0);
        System.out.println(result == 10000 ? "id4 : 10000 : 4 : 0 : ER=10000 - OK : AR = " + result :
                "id4 : 10000 : 4 : 0 : ER=10000 - FAIL : AR = " + result);
    }
}
