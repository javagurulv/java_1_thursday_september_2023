package lv.javaguru.java1.student_milans_micko.lesson_4.lessoncode;

import java.util.Scanner;

public class PositiveNumberDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println("Number is positive!");
        }
        // if (number > 0) { System.out.println("Number is positive!"); } --kak analog reshenija
    }
}
