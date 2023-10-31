package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.level_2;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number!");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is less!!!");
        } else if (firstNumber > secondNumber) {
            System.out.println(secondNumber + " is less!!!");
        } else {
            System.out.println("Numbers are the same!");
        }
    }
}
