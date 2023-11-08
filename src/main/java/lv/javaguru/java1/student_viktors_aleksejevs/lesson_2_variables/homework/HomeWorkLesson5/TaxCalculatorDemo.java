package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson5;

import lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_3_junior.task_1.TaxCalculator;

import java.math.BigDecimal;

public class TaxCalculatorDemo {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        System.out.println("Income 9000, tax = " + calculator.calculateTax(new BigDecimal("9000")));
        System.out.println("Income 15000, tax = " + calculator.calculateTax(new BigDecimal("15000")));
        System.out.println("Income 75000, tax = " + calculator.calculateTax(new BigDecimal("75000")));
        System.out.println("Income 55000, tax = " + calculator.calculateTax(new BigDecimal("55000")));
    }
}
