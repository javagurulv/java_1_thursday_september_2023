package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

class PositiveNumber {

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


        double policyPrice = 24.45;
        if (policyPrice < 50) {
            policyPrice = 50;
        }

        boolean lessThenMinimalPremium = policyPrice < 50;
        if (lessThenMinimalPremium) {
            policyPrice = 50;
        }


    }

}
