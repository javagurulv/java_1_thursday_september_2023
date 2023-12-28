package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

class Rectangle extends Shape {

    private double a;
    private double b;

    Rectangle(String title, double a, double b) {
        super(title);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimeter() { return 2 * (a + b); }
    public double calculateArea() { return a * b; }

    //P = 2 * (a + b)
    //S = a * b
}
