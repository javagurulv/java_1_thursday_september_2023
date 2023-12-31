package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

class Square extends Shape {
    public int side;

    public Square(String shapeName, int side) {
        super(shapeName);
        this.side = side;
    }

    @Override
    double squareRoomCalculator() {
        return side > 0 ? side * side : -1;
    }

    @Override
    double perimeterRoomCalculator() {
        return side > 0 ? side * 4 : -1;
    }
}
