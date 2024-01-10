package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

public class Rectangle extends Shape{

    private double side;

    private double side2;

    public Rectangle (String title, double side, double side2) {
        super(title);
        this.side = side;
        this.side2 = side2;
    }

    double calculateArea() {
        return this.side * this.side2;
    }

    double calculatePerimeter() {
        return 2 * this.side + 2 * this.side2;
    }

    String getShapeProperties() {
        return "side1: " + String.valueOf(side) + "   side2: " + String.valueOf(side2);
    }



}
