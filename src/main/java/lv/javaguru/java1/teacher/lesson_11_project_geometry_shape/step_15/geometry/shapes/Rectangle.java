package lv.javaguru.java1.teacher.lesson_11_project_geometry_shape.step_15.geometry.shapes;

class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(String title, double a, double b) {
        super(title);
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculatePerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
