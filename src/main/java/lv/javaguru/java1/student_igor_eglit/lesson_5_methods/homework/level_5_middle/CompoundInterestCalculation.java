package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_5_middle;

public class CompoundInterestCalculation {
    public static void main(String[] args) {
        CompoundInterest deposit = new CompoundInterest();

        double startingDeposit = 10000;
        double yearRate = 0;
        double numberOfPeriod = 10;

        System.out.println("Starting deposit = " + startingDeposit);
        System.out.println("Year rate = " + yearRate);
        System.out.println("Number of period in years = " + numberOfPeriod);
        System.out.println("Incremental deposit = " + deposit.compoundInterestCalculation(startingDeposit, yearRate, numberOfPeriod));
    }
}
