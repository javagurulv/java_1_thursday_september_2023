package lv.javaguru.java1.student_milans_micko.lesson_5_methods.homework.lvl5;

import java.util.Scanner;

public class CompoundInterestApp {

    public static void main(String[] args) {
        CompoundInterest compoundInterest = new CompoundInterest();
        double sum = 1000;
        double interest = 5;
        double year = 10;

        System.out.println("Sum is = " + sum);
        System.out.println("Interest is = " + interest);
        System.out.println("Year is = " + year);
        System.out.println("Final amount = " + compoundInterest.compoundInterest(sum,interest,year));
    }

}
