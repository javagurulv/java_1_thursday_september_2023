package lv.javaguru.java1.student_milans_micko.lesson_4.homework.lvl2;

import java.util.Scanner;

public class EqualsAndDifferentNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2 : ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals ");
        }
        if (number1 != number2) {
            System.out.println("Numbers are different ");}
    }
}
