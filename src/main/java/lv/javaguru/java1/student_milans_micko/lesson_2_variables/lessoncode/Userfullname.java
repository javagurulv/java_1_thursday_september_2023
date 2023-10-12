package lv.javaguru.java1.student_milans_micko.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class Userfullname {

    // Runtime
    // static code

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + lastName;
        System.out.println("FULL NAME: = " + fullName);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Money: ");
        double money = scanner.nextDouble();

        System.out.println(firstName +
        " " + lastName +
        " = " + age +
        " = " + money
        );

    }
}
