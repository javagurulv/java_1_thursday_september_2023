package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

//import java.util.Scanner;

import java.util.Scanner;

public class KonkantinacijaStrok {
    public static void main(String[] args) {
        //Runtime
        //static code

        // JDK - Java Development Kit 21

        // java compiler    (.java)

        //JVM - Java Virtual Machine

        // bytecode


        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();

        System.out.println("Enter first name ");

        System.out.println("Enter last name ");


        String lastName = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Money: ");
        double money = scanner.nextDouble();
        String fullname = firstName + " " + lastName;

        System.out.println(firstName + " " + lastName + "=" + age + "=" + money);


    }
}
















