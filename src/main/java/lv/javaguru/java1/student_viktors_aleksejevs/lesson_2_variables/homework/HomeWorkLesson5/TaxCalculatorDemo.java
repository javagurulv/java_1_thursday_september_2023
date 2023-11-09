package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson5;

import java.math.BigDecimal;

public class TaxCalculatorDemo {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Income 9000, tax = " + calculator.calculateTax(9000.0));
        System.out.println("Income 15000, tax = " + calculator.calculateTax(15000.0));
        System.out.println("Income 75000, tax = " + calculator.calculateTax(75000.0));
        System.out.println("Income 55000, tax = " + calculator.calculateTax(55000.0));
    }
}
