package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_5;

public class CompoundInterest {

    double getCompoundInterest(double principle, double rate, int timePeriod){
        double compoundInterest = principle * (Math.pow ((1 + rate/100), timePeriod));
        return compoundInterest;
    }
}
