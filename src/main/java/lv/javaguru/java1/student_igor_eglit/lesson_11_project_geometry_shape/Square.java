package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

class Square extends Shape {
    int side;

    public Square(int side) {
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
