package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

class Rectangle extends Shape {
    int sideA;
    int sideB;


    public Rectangle(String shapeName,int sideA, int sideB) {
        super(shapeName);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double squareRoomCalculator() {
        return sideA > 0 && sideB > 0 ? sideA * sideB : -1;
    }

    @Override
    double perimeterRoomCalculator() {
        return sideA > 0 && sideB > 0 ? (sideA+sideB) * 2 : -1;
    }
}
