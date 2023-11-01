package lv.javaguru.java1.student_milans_micko.lesson_4.homework.lvl5;

import java.util.Scanner;

public class CreditCard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int price = scanner.nextInt();

        // esli summa 1000 to komissija 3%
        // esli summa 1000 - 5000 to komissija 4%
        // esli summa 5000< to komissja 5%

        if (price < 1000 && price > 0) {
           int comission = (price * 3) / 100 ;
            System.out.println("Withdrawal commision is " + comission);
        } else if (price >= 1000 && price < 5000) {
            int comission = (price * 4) / 100 ;
            System.out.println("Withdrawal comission is " + comission);
        } else if (price >= 5000) {
            int comission = (price * 5) / 100 ;
            System.out.println("Withdrawal comission is " + comission);
        } else {
            System.out.println("Price > 0!");
        }

    }
}
