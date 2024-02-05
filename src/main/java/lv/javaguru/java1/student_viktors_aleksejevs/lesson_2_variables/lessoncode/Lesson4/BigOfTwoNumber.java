package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson4;

import java.util.Scanner;

public class BigOfTwoNumber {
    public static void main(String[] args) {
        var number1 = new Scanner(System.in).nextInt();
        var number2 = new Scanner(System.in).nextInt();
        if (number1 > number2) {
            System.out.println("Number 1 is bigger");
        } else {
            System.out.println("Number 2 is bigger");
        }
    }
}
