package lv.javaguru.java1.student_artjoms_potasevskis.lesson_4_homework.level_2;

import java.util.Scanner;

class DiffNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        }

        if (number1 != number2) {
            System.out.println("Numbers are different");
        }
    }
}
