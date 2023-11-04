package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_4_junior;

import java.util.Scanner;

public class AreaPerimeterCircleApp {
    public static void main(String[] args) {
        AreaPerimeterCircle circle = new AreaPerimeterCircle();
        System.out.print("Enter radius: ");
        var radius = new Scanner(System.in).nextDouble();
        System.out.println("Circle perimeter = " + circle.perimeter(radius) + "\n"
                + "Circle area = " + circle.area(radius));
    }
}
