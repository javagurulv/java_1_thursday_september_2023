package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

public class Square extends Shape {

    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    double calculateArea() {
        return this.side * this.side;
    }

    double calculatePerimeter() {
        return 4 * this.side;
    }

    String getShapeProperties() {
        return "side: " + String.valueOf(side);
    }

}
