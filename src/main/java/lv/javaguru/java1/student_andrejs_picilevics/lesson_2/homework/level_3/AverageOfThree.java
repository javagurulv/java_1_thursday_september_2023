package lv.javaguru.java1.student_andrejs_picilevics.lesson_2.homework.level_3;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        System.out.println("Please enter three number, after each number please press Enter button");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        double result = (double) (number1 + number2 + number3)/3;
        System.out.println("Your average number is " + result) ;

    }
}
