package lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_2;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your name : ");
        String name = scanner.nextLine();

        System.out.println("Your name is " +name);
    }
}
