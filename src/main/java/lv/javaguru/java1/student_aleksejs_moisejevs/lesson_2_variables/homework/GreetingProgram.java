package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_2_variables.homework;

import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        System.out.println("Hello, " + new Scanner(System.in).nextLine() + "!");
    }
}
