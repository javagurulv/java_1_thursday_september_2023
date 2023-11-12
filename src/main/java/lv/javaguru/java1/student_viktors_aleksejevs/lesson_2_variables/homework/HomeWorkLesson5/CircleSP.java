package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson5;

// Perimeter: C = 2 * R * Pi
// Square: S = Pi * R2

public class CircleSP {
    public double calculateSquare(double radius) {

        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

}

