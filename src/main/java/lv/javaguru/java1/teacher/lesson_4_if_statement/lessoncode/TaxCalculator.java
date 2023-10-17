package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter annual income: ");
        int annualIncome = scanner.nextInt();

        if (annualIncome < 10000) {
            int tax = annualIncome / 100 * 10;
            System.out.println("Tax = " + tax);
        }

        if ((annualIncome >= 10000) && (annualIncome < 20000)) {
            int reminder10k = annualIncome - 10000;
            int tax10k = 10000 / 100 * 10;
            int taxReminder = reminder10k / 100 * 15;
            int tax = tax10k + taxReminder;
            System.out.println("Tax = " + tax);
        } else {
            int reminder20k = annualIncome - 20000;
            int tax10k = 10000 / 100 * 10;
            int tax20k = 10000 / 100 * 15;
            int taxReminder = reminder20k / 100 * 20;
            int tax = tax10k + tax20k + taxReminder;
            System.out.println("Tax = " + tax);
        }

    }

}
