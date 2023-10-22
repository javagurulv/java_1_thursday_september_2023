package lv.javaguru.java1.student_jelena_vavere.lesson_2_variables.homework;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: " );
        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");
    }
}
