package lv.javaguru.java1.student_valera_kovs.lesson_1_introduction.homework;

import java.util.Scanner;
public class task3HardWorkLesson2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius :");
        double r = scanner.nextDouble();

        System.out.println("Perimeter is " + 2 * Math.PI * r);
        System.out.println("Square is " + Math.PI * r * r);
    }
}
