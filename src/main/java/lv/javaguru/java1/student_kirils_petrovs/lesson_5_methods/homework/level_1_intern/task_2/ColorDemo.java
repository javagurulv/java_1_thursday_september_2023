package lv.javaguru.java1.student_kirils_petrovs.lesson_5_methods.homework.level_1_intern.task_2;

import java.util.Scanner;

public class ColorDemo {

    public static void main(String[] args) {
        System.out.println("colors of the visible spectrum");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int input = scanner.nextInt();

        Color color = new Color();
        color.determineColor(input);
    }
}