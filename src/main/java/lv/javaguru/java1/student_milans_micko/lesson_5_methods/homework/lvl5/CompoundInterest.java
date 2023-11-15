package lv.javaguru.java1.student_milans_micko.lesson_5_methods.homework.lvl5;

public class CompoundInterest {

    double finalAmount;

    public double compoundInterest(double sum,
                                   double interest,
                                   double years){
        return finalAmount = sum * Math.pow((1 + interest / 100), years);
    }
}
