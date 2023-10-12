package lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_3;

import java.util.Scanner;

public class CircleRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Circle Radius :");
        double r = scanner.nextDouble();

        System.out.println("Circle`s Perimeter is " + 2 * Math.PI * r);
        System.out.println("Circle`s Square is " + Math.PI * r * r);

    }
}
