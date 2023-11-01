package lv.javaguru.java1.student_milans_micko.lesson_4.homework.lvl3;

import java.util.Scanner;

public class OneOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2 : ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3 : ");
        int number3 = scanner.nextInt();

        if (number1 > number2 && number2 > number3) {
            System.out.println("Bigger is " + number1);
        } else if(number2 > number3 && number2 > number3) {
            System.out.println("Bigger is " + number2);
        } else if(number3 > number1 && number3 > number2) {
            System.out.println("Bigger is " + number3);
        }
    }
}
