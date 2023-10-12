package lv.javaguru.java1.teacher.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class UserFullName {

    // Runtime
    // static code

    // JDK - Java Development Kit 21

    // java compiler  (.java) -> bytecode

    // JVM - Java Virtual Machine

    // bytecode

    // lv.javaguru.java1.teacher

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        dfsd

        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;
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
