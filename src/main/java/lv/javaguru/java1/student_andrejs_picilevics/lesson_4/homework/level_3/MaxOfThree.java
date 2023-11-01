package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.level_3;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a first number");

        int firstNumber = scanner.nextInt();
        System.out.println("Please enter a second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter e third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is larger: " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is larger: " + secondNumber);
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third number is larger: " + thirdNumber);
        } else {
            System.out.println("There are several numbers that are equal");
        }
    }
}







