package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

class Square extends Shape {

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }
    public double calculatePerimeter() { return 4 * side; }
    public double calculateArea() { return side * side; }

}
