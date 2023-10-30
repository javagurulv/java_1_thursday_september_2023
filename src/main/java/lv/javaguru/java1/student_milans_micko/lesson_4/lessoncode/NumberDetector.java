package lv.javaguru.java1.student_milans_micko.lesson_4.lessoncode;

import java.util.Scanner;

public class NumberDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        boolean isNegative = number < 0;
        boolean isZero = number == 0;
        boolean isPositive = number > 0;

        System.out.println("Number is negative = " + isNegative);
        System.out.println("Number is zero = " + isZero);
        System.out.println("Number is positive = " + isPositive);
    }
}
