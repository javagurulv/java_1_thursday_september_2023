package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_2_intern.task_2;

import java.util.Scanner;

class MinNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 < number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }

}
