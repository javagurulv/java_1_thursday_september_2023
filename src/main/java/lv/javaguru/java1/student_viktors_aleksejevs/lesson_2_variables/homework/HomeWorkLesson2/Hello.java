package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson2;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String Viktors = scanner.nextLine();
        System.out.println("Hello " + Viktors);

    }


}
