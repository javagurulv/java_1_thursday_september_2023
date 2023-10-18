package lv.javaguru.java1.student_andrejs_picilevics.lesson_2.lessoncode;

import java.util.Scanner;

public class UserFullName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter Yor age: ");
        int age = scanner.nextInt();

        System.out.println("Your full name is "+firstName+" "+lastName +" and Your age is " + age);
        // srazu pomenjatj nazvanije vezde - Refactor -> Rename
        //String firstName = "Vasja";
       // String lastName = "Pupkin";
       // String result = firstName + lastName;

    }
}
