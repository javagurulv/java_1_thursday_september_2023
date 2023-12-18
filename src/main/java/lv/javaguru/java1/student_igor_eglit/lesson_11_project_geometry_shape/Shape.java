package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

abstract class Shape {
    abstract double squareRoomCalculator();

    abstract double perimeterRoomCalculator();

    String shapeName;

    Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Shape) {
            Shape other = (Shape) obj;
            return this.shapeName.equals(other.shapeName) && this.squareRoomCalculator() == other.squareRoomCalculator();
        }
        return false;
    }
}