package lv.javaguru.java1.student_valera_kovs.lesson4.homework_lesson_4.lvl2;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: num1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: num2 ");
        int num2 = scanner.nextInt();
        if ( num1 > num2 ) {

            System.out.println("num1 is bigger");
        } else {
            System.out.println("num2 is bigger");
        }
    }
}
