package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl3;

import java.util.Scanner;

public class TaxesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price : ");
        int price = scanner.nextInt();

        TaxesCalculator taxesCalculator = new TaxesCalculator();
        System.out.println("Your taxes = " + taxesCalculator.lowTax(price));
    }
}
