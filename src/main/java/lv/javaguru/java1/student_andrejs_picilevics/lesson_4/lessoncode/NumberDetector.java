package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.lessoncode;

import java.util.Scanner;

class NumberDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegativeNumber = number < 0;
        boolean isZero = number == 0;
        boolean isPositiveNumber = number > 0;

        System.out.println("Number is negative = " + isNegativeNumber);
        System.out.println("Number is zero = " + isZero);
        System.out.println("Number is positive = " + isPositiveNumber);
    }
}
