package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import java.util.Random;

class ShapeUtil {
    private int radius = new Random().nextInt(10);

    public Circle createRandomCircle() {
        return new Circle(radius);
    }

}

