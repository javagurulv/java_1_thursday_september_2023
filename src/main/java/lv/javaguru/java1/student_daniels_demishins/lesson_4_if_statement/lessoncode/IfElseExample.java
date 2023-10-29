package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA > numB) {
            System.out.println("Bigger number is " + numA);
        } else System.out.println("Bigger number is " + numB);
    }
}
