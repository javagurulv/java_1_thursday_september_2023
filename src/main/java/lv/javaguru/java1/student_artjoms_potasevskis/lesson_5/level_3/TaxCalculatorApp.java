package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_3;

import java.util.Scanner;
  class TaxCalculatorApp {
        public static void main(String[] args) {
            TaxCalculator salary = new TaxCalculator();
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
