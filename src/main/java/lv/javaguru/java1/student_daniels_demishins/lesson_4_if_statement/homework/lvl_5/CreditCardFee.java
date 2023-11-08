package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.homework.lvl_5;

import java.util.Scanner;

 class CreditCardFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cash withdrawal amount ");
        int num = scanner.nextInt();

        if (num < 1000 && num > 0) {
            int comission = (num / 100 * 3);
            System.out.print("Cash withdrawal amount " + comission);
        } else if (num > 1000 && num < 5000) {
            int comission = (num / 100 * 4);
            System.out.print("Cash withdrawal amount " + comission);
        } else if (num >= 5000){
            int comission = (num / 100 * 5);
            System.out.println("Cash withdrawal amount " + comission);
        } else {
            System.out.println("Sum must be > 0");
        }
    }
}
