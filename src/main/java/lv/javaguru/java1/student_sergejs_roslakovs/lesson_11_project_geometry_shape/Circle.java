package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

public class Circle extends Shape {

    private final double pi = 3.14159;
    private double r;

    public Circle(String title, double r) {
        super(title);
        this.r = r;
    }

    double calculateArea() {
        return pi * this.r * this.r;
    }

    double calculatePerimeter() {
        return 2 * pi * this.r;
    }

    String getShapeProperties() {
        return "radius: " + String.valueOf(r);
    }

}
