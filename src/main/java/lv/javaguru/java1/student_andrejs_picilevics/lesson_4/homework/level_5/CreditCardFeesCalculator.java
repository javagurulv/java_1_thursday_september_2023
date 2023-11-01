package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.level_5;

import java.util.Scanner;

public class CreditCardFeesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount!");
        int sum = scanner.nextInt();

        double commission;

        if (sum < 1000) {
            commission = sum * 0.03;
            System.out.println("Commission = " + commission);
        } else if (sum < 5000) {
            commission = sum * 0.04;
            System.out.println("Commission = " + commission);
        } else {
            commission = sum * 0.05;
            System.out.println("Commission = " + commission);
        }
    }

}
