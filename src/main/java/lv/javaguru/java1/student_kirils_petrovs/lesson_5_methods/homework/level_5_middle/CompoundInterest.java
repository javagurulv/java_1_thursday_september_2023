package lv.javaguru.java1.student_kirils_petrovs.lesson_5_methods.homework.level_5_middle;

import java.util.Scanner;

public class CompoundInterest {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the initial amount (P): ");
                double P = scanner.nextDouble();

                System.out.print("Enter the annual interest rate (r): ");
                double r = scanner.nextDouble();

                System.out.print("Enter the number of times interest is compounded per year (n): ");
                double n = scanner.nextDouble();

                System.out.print("Enter the number of years (t): ");
                double t = scanner.nextDouble();

                double A1 = 1 + r / n;
                double A2 = Math.pow(A1, n * t);
                double A3 = P * A2;

                System.out.println("Answer: " + A3);
        }
}



