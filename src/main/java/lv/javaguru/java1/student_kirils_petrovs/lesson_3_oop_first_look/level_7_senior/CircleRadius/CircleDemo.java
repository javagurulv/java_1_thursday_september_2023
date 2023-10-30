package lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.CircleRadius;

import lv.javaguru.java1.student_kirils_petrovs.lesson_3_oop_first_look.level_7_senior.CircleRadius.Circle;

class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = circle.calculateArea();
        double radius = circle.getRadius();
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + area);
    }
}