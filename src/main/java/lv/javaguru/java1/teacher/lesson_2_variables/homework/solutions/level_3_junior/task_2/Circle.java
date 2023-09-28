package lv.javaguru.java1.teacher.lesson_2_variables.homework.solutions.level_3_junior.task_2;

import java.util.Scanner;

class Circle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius: ");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI + radius * radius;
        System.out.println("Circle area = " + circleArea);

        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println("Circle perimeter = " + circlePerimeter);
    }

}
