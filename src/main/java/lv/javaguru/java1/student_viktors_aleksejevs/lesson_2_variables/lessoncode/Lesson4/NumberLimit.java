package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson4;

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
