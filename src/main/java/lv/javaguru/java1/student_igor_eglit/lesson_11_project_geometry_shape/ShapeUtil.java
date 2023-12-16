package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import java.util.Random;

class ShapeUtil {

    public Circle createRandomCircle() {
        return new Circle(new Random().nextInt(10));
    }
    public Square createRandomSquare() {
        return new Square(new Random().nextInt(10));
    }

}

