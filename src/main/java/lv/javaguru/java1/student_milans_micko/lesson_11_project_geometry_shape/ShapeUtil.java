package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

import java.util.Random;

class ShapeUtil {

    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble(10);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble(10);
        return new Square("Square", side);
    }

    public Rectangle createRandomRectangle() {
        double a = random.nextInt(1);
        double b = random.nextInt(10);
        return new Rectangle("Rectangle", a, b);
    }
    public Shape createRandomShape() {

        return null;
    }
}
