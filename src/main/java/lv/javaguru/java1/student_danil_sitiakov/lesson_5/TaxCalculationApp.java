package lv.javaguru.java1.student_danil_sitiakov.lesson_5;


import java.util.Scanner;

class TaxCalculationApp {
    public static void main(String[] args) {
        TaxCalculation taxCalculation = new TaxCalculation();
        System.out.println("8000 euro = 30% tax = " + taxCalculation.calculate10k30(8000));
        System.out.println("25000 euro = 40% tax = " + taxCalculation.calculate10_50k40(25000));
        System.out.println("50000 euro = 50% tax = " + taxCalculation.calculate10_50k40(50000));
        System.out.println("55000 euro = 50% tax = " + taxCalculation.calculate50k50(55000));


        TaxCalculation taxCalculation1 = new TaxCalculation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sum: ");
        int num = scanner.nextInt();

        if (num > 0 && num <= 10000) {
            System.out.println("Tax with 30% = " + taxCalculation1.calculate10k30(num));
        } else if (num > 10001 && num <= 50000) {
            System.out.println("Tax with 40% = " + taxCalculation1.calculate10_50k40(num));
        } else if (num > 50001) {
            System.out.println("Tax with 50% = " + taxCalculation1.calculate50k50(num));
        } else {
            System.out.println("Incorrect sum");
        }
    }
}