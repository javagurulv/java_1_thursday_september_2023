package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_2_intern;

import java.util.Scanner;

public class BiggerIsBetter {
    public static void main(String[] args) {
        System.out.println("Введите два целых числа:");
        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();
        if (a > b) {
            System.out.println(a + " больше");
        } else if (a < b) {
            System.out.println(b + " больше");
        } else {
            System.out.println("Числа равны");
        }
    }
}
