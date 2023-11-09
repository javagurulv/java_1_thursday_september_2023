package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl4;

import lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl3.TaxesCalculator;

import java.util.Scanner;

public class SquarePerimeterAndAreaCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the square:");
        int radius = scanner.nextInt();

        SquarePerimeterAndAreaCalculator squarePerimeterAndAreaCalculator = new SquarePerimeterAndAreaCalculator();
        System.out.println("Your square area = " + squarePerimeterAndAreaCalculator.sqrArea(radius));
        System.out.println("Your square perimeter = " + squarePerimeterAndAreaCalculator.sqrPerimeter(radius));
    }
}
