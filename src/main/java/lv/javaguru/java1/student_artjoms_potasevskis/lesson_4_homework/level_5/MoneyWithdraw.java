package lv.javaguru.java1.student_artjoms_potasevskis.lesson_4_homework.level_5;

import java.util.Scanner;

public class MoneyWithdraw {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money sum: ");
        int moneyWithdraw = scanner.nextInt();

        double commissionFee = 0.0;
        if (moneyWithdraw < 1000) {
            commissionFee = (double) moneyWithdraw / 100 * 3;
        }

        if (moneyWithdraw >= 1000 && moneyWithdraw < 5000) {
            commissionFee = (double) moneyWithdraw / 100 * 4;
        }

        if (moneyWithdraw >= 5000) {
            commissionFee = (double) moneyWithdraw / 100 * 5;
        }

        System.out.println("Commission fee = " + commissionFee);
    }


}
