package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NumberDetector {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        var number = new Scanner(System.in).nextInt();
        boolean isNegativeNumber = number < 0;
        System.out.println("Number is negative= " + isNegativeNumber);
        boolean isNumberZero = number == 0;
        System.out.println("Number is zero  " + isNumberZero);
        boolean isPOsitiveNumber = number > 0;
        System.out.println("Number is positive= " + isPOsitiveNumber);
    }
}
