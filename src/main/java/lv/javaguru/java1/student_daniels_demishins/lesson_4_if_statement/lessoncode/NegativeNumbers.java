package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isNegativeNumber = number <0;

        System.out.println("Number is negative " + isNegativeNumber);

    }
}
