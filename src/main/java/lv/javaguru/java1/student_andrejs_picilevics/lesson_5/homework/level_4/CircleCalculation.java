package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_4;

public class CircleCalculation {
    //S = пr2 - area
    // P = 2пR - perimeter

    double calculateArea(double radius) {
        double s = Math.PI * radius * radius;
        return s;
    }

    double calculatePerimeter(double radius) {
        double p = 2 * Math.PI * radius;
        return p;
    }
}
