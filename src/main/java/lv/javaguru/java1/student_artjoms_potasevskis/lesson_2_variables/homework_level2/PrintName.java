package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2_variables.homework_level2;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        System.out.println("What is our name");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        System.out.println("Hello" + Name);
    }



}

