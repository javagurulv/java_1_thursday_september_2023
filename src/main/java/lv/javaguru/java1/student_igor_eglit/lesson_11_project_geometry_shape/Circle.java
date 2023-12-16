package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

class Circle extends Shape {

    int radius;

    public Circle(int radius) {
        this.radius = radius;

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
