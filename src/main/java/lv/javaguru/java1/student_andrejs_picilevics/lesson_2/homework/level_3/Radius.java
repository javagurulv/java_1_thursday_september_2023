package lv.javaguru.java1.student_andrejs_picilevics.lesson_2.homework.level_3;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {

        System.out.println("Please enter a radius ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);

        System.out.println("Perimeter is = " + perimeter );
        System.out.println("Area is = " + area);

    }
}
