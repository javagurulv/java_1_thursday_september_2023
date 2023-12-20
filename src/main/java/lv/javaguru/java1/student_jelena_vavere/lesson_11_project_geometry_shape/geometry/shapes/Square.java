package lv.javaguru.java1.student_jelena_vavere.lesson_11_project_geometry_shape.geometry.shapes;
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
