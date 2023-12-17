package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ShapeUtilDemo {
    public static void main(String[] args) {
        circleCalculation();
        squareCalculation();
        rectangleCalculation();
        findEquals();
    }

    private static void circleCalculation() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateSquare(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Площадь круга = " + circleArea + '\t' + "Периметр круга = " + circlePerimeter);
    }

    private static void squareCalculation() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateSquare(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Площадь квадрата = " + squareArea + '\t' + "Периметр квадрата = " + squarePerimeter);
    }

    private static void rectangleCalculation() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateSquare(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Площадь прямоугольника = " + rectangleArea + '\t' + "Периметр прямоугольника = " + rectanglePerimeter);
    }

    private static void findEquals() {
        List<Shape> allShapes = new ArrayList<>();
        ShapeUtil shapeUtil = new ShapeUtil();
        Circle circle1 = new Circle("Circle", 1);
        Circle circle2 = new Circle("Circle", 2);
        for (int i = 0; i < 100; i++) {
            Shape randomShape = shapeUtil.createRandomShape();
            allShapes.add(randomShape);
        }
        System.out.println(allShapes.size() + " allShapes List");
        var a = shapeUtil.findEquals(allShapes, circle1);
        var b =shapeUtil.findEquals(allShapes, circle2);
        System.out.println(a.size() + " equals circle1 List");
        System.out.println(b.size() + " equals circle2 List");

    }

}
