package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_1_intern;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Введи целое число: ");
        var a = new Scanner(System.in).nextInt();
        var result = a % 2;
        if (result == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");

        }
    }
}
