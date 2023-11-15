package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl7;

class CompoundInterestCalculator {
    //testcase1: 100, 5, 10; expected result: 1628.89
    //testcase2: 0, 5, 10; expected result: 0
    //testcase3: 100, 0, 10; expected result: 1000
    //testcase4: 100, 5, 0; expected result: 1000

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
