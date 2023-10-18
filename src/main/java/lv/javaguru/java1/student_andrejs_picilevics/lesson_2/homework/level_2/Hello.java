package lv.javaguru.java1.student_andrejs_picilevics.lesson_2.homework.level_2;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

    }
}
