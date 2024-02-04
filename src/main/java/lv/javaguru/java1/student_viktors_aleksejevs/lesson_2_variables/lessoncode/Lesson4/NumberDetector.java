package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson4;

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
