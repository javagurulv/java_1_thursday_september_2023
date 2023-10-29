package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NumberLimit {
    public static void main(String[] args) {
        System.out.println("Insert number:");
        var a = new Scanner(System.in).nextInt();
        if (a > 0 && a <= 10) {
            System.out.println("Number " + a + " is inside the '1 to 10' limits");
        } else {
            System.out.println("Number " + a + " is outside the '1 to 10' limits");
        }
    }
}
