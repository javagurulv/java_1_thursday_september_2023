package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_3_junior;

import java.util.Scanner;

public class ThreeInteger {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа: ");
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();
        var c = new Scanner(System.in).nextInt();
        if (a > b && a > c) {
            System.out.println(a + " больше");
        } else if (b > a && b > c) {
            System.out.println(b + " больше");
        } else if (a == b && b == c) {
            System.out.println("Числа равны");
        } else {
            System.out.println(c + " больше");
        }
    }
}