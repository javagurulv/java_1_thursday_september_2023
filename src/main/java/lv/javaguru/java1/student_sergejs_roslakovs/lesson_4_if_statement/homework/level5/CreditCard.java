package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.homework.level5;

import java.util.Scanner;

class CreditCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the withdrawal amount: ");
        int withdrawalAmount = scanner.nextInt();

        double commissionAmount;

        if (withdrawalAmount < 1000) {
            commissionAmount = withdrawalAmount * 0.03;

        } else if (withdrawalAmount >= 1000 && withdrawalAmount <= 5000) {
            commissionAmount = withdrawalAmount * 0.04;
        } else {
            commissionAmount = withdrawalAmount * 0.05;
        }
        System.out.println("Commission amount: " + commissionAmount );

        scanner.close();
    }
}











