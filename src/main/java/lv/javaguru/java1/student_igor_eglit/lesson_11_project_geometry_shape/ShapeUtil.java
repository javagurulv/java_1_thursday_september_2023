package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import java.util.Random;

class ShapeUtil {

    public Circle createRandomCircle() {
        return new Circle(new Random().nextInt(10));
    }

    public Square createRandomSquare() {
        return new Square(new Random().nextInt(10));
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle(new Random().nextInt(10), new Random().nextInt(10));
    }

    public Shape createRandomShape() {
        var shapeChoose = new Random().nextInt(3);
        return switch (shapeChoose) {
            case 0 -> createRandomCircle();
            case 1 -> createRandomSquare();
            case 2 -> createRandomRectangle();
            default -> null;
        };
    }

    public double calculateArea(Shape[] shapes) {
        var sum = 0;
        for (Shape shape : shapes) {
            sum += shape.squareRoomCalculator();
        }
        return sum;
    }

    //        Circle circle = new Circle(2);
//        Square square = new Square(3);
//        Rectangle rectangle = new Rectangle(2, 3);
//        shapes = new double[]{
//                circle.squareRoomCalculator(),
//                square.squareRoomCalculator(),
//                rectangle.squareRoomCalculator(),
//        };
//        var sum = 0;
//        for (double value : shapes) {
//            sum += value;
//        }
//        return sum;
    // }
    public double calculatePerimeter(Shape[] shapes) {
        var sum = 0;
        for (Shape shape : shapes) {
            sum += shape.perimeterRoomCalculator();
        }
        return sum;
    }
    double calculateSquare(Shape shape) {
        return shape.squareRoomCalculator();
    }

    double calculatePerimeter(Shape shape) {
        return shape.perimeterRoomCalculator();
    }
}

