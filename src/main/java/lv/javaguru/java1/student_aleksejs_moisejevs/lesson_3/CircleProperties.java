package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_3;


import java.util.Scanner;

public class CircleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter circle radius: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Circle area = " + perimeter);
        System.out.println("Circle perimeter = " + area);

        scanner.close();
    }
}
