package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        }

        if (number1 < number2) {
            System.out.println("Biggest number is " + number2);
        }


        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        } else {
            System.out.println("Biggest number is " + number2);
        }


        if (number1 > number2) {
            System.out.println("Biggest number is " + number1);
        } else if (number2 > number1) {
            System.out.println("Biggest number is " + number2);
        } else {
            System.out.println("Number are equals!");
        }





    }

}
