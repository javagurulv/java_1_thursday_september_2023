package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_7_senior.task_1;

class CompoundInterestCalculator {

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return sum * Math.pow((1 + interest / 100), years);
    }

}
