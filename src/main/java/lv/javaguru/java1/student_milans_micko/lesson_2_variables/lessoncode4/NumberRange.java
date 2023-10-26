package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode4;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("Number is between range (1-10)");
        } else {
            System.out.println("Number is NOT between (1-10)");

        }
    }
}
