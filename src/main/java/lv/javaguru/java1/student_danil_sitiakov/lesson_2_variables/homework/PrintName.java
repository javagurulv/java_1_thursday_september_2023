package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.homework;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your name : ");
        String name = scanner.nextLine();

        System.out.println("Your name is " +name);
    }
}
