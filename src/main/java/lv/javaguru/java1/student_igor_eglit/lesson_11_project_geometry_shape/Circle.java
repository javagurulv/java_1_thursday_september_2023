package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

class Circle extends Shape {

    public int radius;
    public String shapeName;

    public int getRadius() {
        return radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public Circle(String shapeName, int radius) {
        super(shapeName);
        this.radius = radius;
        this.shapeName = shapeName;

    }

    @Override
    double squareRoomCalculator() {
        return radius > 0 ? (3.14 * (radius * radius)) : -1;
    }

    @Override
    double perimeterRoomCalculator() {
        return radius > 0 ? (2 * 3.14 * radius) : -1;
    }
}
