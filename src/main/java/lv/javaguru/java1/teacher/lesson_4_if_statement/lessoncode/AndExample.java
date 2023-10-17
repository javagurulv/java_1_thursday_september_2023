package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class AndExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }

    }

}
