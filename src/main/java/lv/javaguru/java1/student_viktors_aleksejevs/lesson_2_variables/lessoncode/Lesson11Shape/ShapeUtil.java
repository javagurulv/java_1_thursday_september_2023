package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson11Shape;

import java.util.Random;

public class ShapeUtil {

    private Random random = new Random();

    public Circle createRandomCircle() {
        double radius = random.nextDouble(20);
        return new Circle("Circle", radius);
    }

    public Square createRandomSquare() {
        double side = random.nextDouble(10);
        return new Square("Square", side);

    }

    public Rectangle createRandomRectangle() {
        double a = random.nextInt(20);
        double b = random.nextInt(20);
        return new Rectangle("Rectangle", a, b);
    }

    public Shape createRandomShape() {
        int randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else {
            return createRandomRectangle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum = areaSum + shape.calculateArea();
        }
        return areaSum;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum = perimeterSum + shape.calculatePerimeter();
        }
        return perimeterSum;
    }
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}



