package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() { return 2 * Math.PI * radius; }
    public double calculateArea() { return Math.PI * (radius * radius); }
}
