package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_5_middle.task_1;

import java.util.Scanner;

class CreditCardFeesCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cache sum: ");
        int cacheSum = scanner.nextInt();

        double commissionFee = 0.0;
        if (cacheSum < 1000) {
            commissionFee = (double) cacheSum / 100 * 3;
        }

        if (cacheSum >= 1000 && cacheSum < 5000) {
            commissionFee = (double) cacheSum / 100 * 4;
        }

        if (cacheSum >= 5000) {
            commissionFee = (double) cacheSum / 100 * 5;
        }

        System.out.println("Commission fee = " + commissionFee);
    }

}
