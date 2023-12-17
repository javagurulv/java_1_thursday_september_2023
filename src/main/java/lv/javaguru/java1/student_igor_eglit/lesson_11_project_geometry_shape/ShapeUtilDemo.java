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
        Circle circleTest = new Circle("Circle", 1);
        for (int i = 0; i < 20; i++) {
            Shape circle = shapeUtil.createRandomCircle();
            Shape square = shapeUtil.createRandomSquare();
            Shape rectangle = shapeUtil.createRandomRectangle();

            allShapes.add(circle);
            allShapes.add(square);
            allShapes.add(rectangle);
        }
        System.out.println(allShapes.size() + " allShapes");
        shapeUtil.findEquals(allShapes, circleTest);

    }

}
