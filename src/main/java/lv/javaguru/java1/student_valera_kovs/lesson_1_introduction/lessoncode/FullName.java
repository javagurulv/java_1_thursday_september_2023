package lv.javaguru.java1.student_valera_kovs.lesson_1_introduction.lessoncode;

import java.util.Scanner;

public class FullName {

    //  Runtime
    //  Static code

    // JDK Java Development Kit 21
    // Java kompiler (.java)

    //JMV - Java Virtual Machine

    //bytecode

    //lv.javaguru.java1.teacher


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstname = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastname = scanner.nextLine();

        String fullname = firstname + " " + lastname;
        System.out.println("FULLNAME" + fullname);

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Money:");
        double money = scanner.nextDouble();

        System.out.println(firstname+" " + lastname);

    System.out.println( firstname +
    "" + lastname +
            " = " + age +
            " = " + money
    );

        }
}