package lv.javaguru.java1.student_valera_kovs.lesson4;

import java.util.Scanner;
public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println("Number is positive!");

        }
        if (number > 0) {
            System.out.println("Number is positive!");

        }

    }
}
