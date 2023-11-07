package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level5;

public class CompoundInterest {
    public double calculateCompoundInterest(double principal, double rate, int years) {
        double amount = principal * Math.pow(1 + rate, years);
        return amount - principal;
    }
}





