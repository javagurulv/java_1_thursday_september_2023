package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level5;

class CompoundInterestCalculator {

    public static void main(String[] args) {
        CompoundInterest interest = new CompoundInterest();

        double principal = 1000;
        double rate = 0.05;
        int years = 5;

        System.out.println(" Principal = " + principal);
        System.out.println(" Rate = " + rate);
        System.out.println(" Years = " + years);
        System.out.println(" Interest = " + interest.calculateCompoundInterest(principal, rate, years));
    }





}
