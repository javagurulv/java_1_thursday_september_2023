package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_5;



import java.util.Scanner;

public class SalaryTaxCalculatorApp {
    public static void main(String[] args) {
        System.out.println("Enter salary: ");
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        SalaryTaxCalculator calculator = new SalaryTaxCalculator();
        double tax = calculator.calculate(salary);

        System.out.println("Tax = " + tax);
    }

}
