package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        System.out.println("Number is negative = " + isNegative);

        boolean isZero = number == 0;
        System.out.println("Number is zero = " + isZero);

        boolean isPositive = number > 0;
        System.out.println("Number is positive = " + isPositive);
    }

}
