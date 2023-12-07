package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class NumberDetector {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegativeNumber = number < 0;
        System.out.println("Number is negative = " + isNegativeNumber);

        boolean isPositiveNumber = number > 0;
        System.out.println("Number is positive = " + isPositiveNumber);

        boolean isZero = number == 0;
        System.out.println("Number is zero = " + isZero);

    }
}
