package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_3_junior;

import java.util.Scanner;

public class TaxesCalculationInOut {
    public static void main(String[] args) {
        TaxesCalculationMethod salary = new TaxesCalculationMethod();
        while (true) {
            System.out.print("Enter your salary: ");
            int money = new Scanner(System.in).nextInt();
            if (money > 0 && money < 10_000) {
                System.out.println("Your taxpayment = " + salary.lowTax(money));
            }
            if (money >= 10_000 && money < 50_000) {
                System.out.println("Your taxpayment = " + salary.midTax(money));
            }
            if (money >= 50_000) {
                System.out.println("Your taxpayment = " + salary.highTax(money));
            }
            if (money == 0) {
                break;
            }
        }
    }
}