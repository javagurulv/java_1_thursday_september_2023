package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_3_junior.task_1;

import java.util.Scanner;

class MaxOfThree {

    private static int max(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter third number: ");
        int number3 = scanner.nextInt();

        int maxNumber = max(number1, number2);
        maxNumber = max(maxNumber, number3);

        System.out.println("Max number = " + maxNumber);
    }

}
