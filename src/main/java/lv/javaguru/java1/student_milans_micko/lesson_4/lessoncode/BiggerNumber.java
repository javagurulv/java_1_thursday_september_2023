package lv.javaguru.java1.student_milans_micko.lesson_4.lessoncode;

import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();

        if (number1 > number2)  {
            System.out.println("Number 1 is bigger");
        } else {
            System.out.println("Number 2 is bigger");
        }
    }
}
