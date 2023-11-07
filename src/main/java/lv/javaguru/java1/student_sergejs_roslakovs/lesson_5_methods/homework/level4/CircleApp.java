package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level4;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        double area1 = circle1.calculateArea();
        double perimeter1 = circle1.calculatePerimeter();
        System.out.println("Circle 1 - Radius: 5.0");
        System.out.println("           Area: " + area1);
        System.out.println("           Perimeter: " + perimeter1);

        Circle circle2 = new Circle(7.5);
        double area2 = circle2.calculateArea();
        double perimeter2 = circle2.calculatePerimeter();
        System.out.println("Circle 2 - Radius: 7.5");
        System.out.println("           Area: " + area2);
        System.out.println("           Perimeter: " + perimeter2);
    }
}









