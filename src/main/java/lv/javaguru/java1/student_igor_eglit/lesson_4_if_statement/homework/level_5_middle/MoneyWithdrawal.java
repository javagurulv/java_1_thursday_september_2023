package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_5_middle;

import java.util.Scanner;

public class MoneyWithdrawal {
    public static void main(String[] args) {
        System.out.print("Введите сумму вывода наличности: ");
        var moneyWithdrawal = new Scanner(System.in).nextInt();
        if (moneyWithdrawal < 1000 && moneyWithdrawal > 0) {
            var commissionResult = (moneyWithdrawal * 3.0) / 100;
            System.out.println("комиссия за использование кредитной карты составит: " + commissionResult);
        } else if (moneyWithdrawal >= 1000 && moneyWithdrawal < 5000) {
            var commissionResult = (moneyWithdrawal * 4.0) / 100;
            System.out.println("комиссия за использование кредитной карты составит: " + commissionResult);
        } else if (moneyWithdrawal >= 5000) {
            var commissionResult = (moneyWithdrawal * 5.0) / 100;
            System.out.println("комиссия за использование кредитной карты составит: " + commissionResult);
        } else {
            System.out.println("Сумма должна быть больше нуля");
        }
    }

}
