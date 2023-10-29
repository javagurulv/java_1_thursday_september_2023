package lv.javaguru.java1.student_artjoms_potasevskis.lesson_4_homework.level_3;

import java.util.Scanner;

class MaxOfThree {

    private static int max(int number1, int number2) {
        return (number1 > number2) ? number1 : number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int number3 = scanner.nextInt();

        int maxNumber = max(number1, number2);
        maxNumber = max(maxNumber, number3);

        System.out.println("Max number = " + maxNumber);
    }



}
