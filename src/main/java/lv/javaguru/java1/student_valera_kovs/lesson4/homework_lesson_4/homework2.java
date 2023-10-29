package lv.javaguru.java1.student_valera_kovs.lesson4.homework_lesson_4;

import java.util.Scanner;

public class homework2 {

    public static void main(String[] args) {
        System.out.println("Enter number even");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is positive");

        } else {
            System.out.println("Number is negative");
        }
    }
        }

