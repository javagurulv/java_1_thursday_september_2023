package lv.javaguru.java1.student_valera_kovs.lesson4.homework_lesson_4.lvl3;

import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: num1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: num2 ");
        int num2 = scanner.nextInt();
        System.out.println("Enter second number: num3 ");
        int num3 = scanner.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("num1 is biggest");

        } else {
            System.out.println("num2 is biggest");
            System.out.println("num3 is biggest");





        }
    }
}
