package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_2_intern.task_3;

import java.util.Scanner;

class EqualNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        }

        if (number1 != number2) {
            System.out.println("Numbers are different");
        }
    }

}
