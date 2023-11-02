package lv.javaguru.java1.student_valera_kovs.lesson4.homework_lesson_4.lvl5;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int sum = scanner.nextInt();

        double commission;

        if (sum < 1000) {
            commission = sum * 0.03;
            System.out.println("Commission = " + commission);
        } else if (sum < 5000) {
            commission = sum * 0.04;
            System.out.println("Commission = " + commission);
        } else {
            commission = sum * 0.05;
            System.out.println("Commission = " + commission);
        }
    }

}