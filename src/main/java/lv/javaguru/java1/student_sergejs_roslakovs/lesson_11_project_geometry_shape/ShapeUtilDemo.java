package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle area = " + circleArea);
        System.out.println("Circle perimeter = " + circlePerimeter);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println("Square area = " + squareArea);
        System.out.println("Square perimeter = " + squarePerimeter);

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);
        System.out.println("Rectangle area = " + rectangleArea);
        System.out.println("Rectangle perimeter = " + rectanglePerimeter);

        System.out.println("==========================================================");
        List<Shape> existingShapes = new ArrayList<>();
        Shape shapeNew;
        shapeNew = new Circle("Circle1", 2);
        existingShapes.add(shapeNew);
        shapeNew = new Circle("Circle2", 3);
        existingShapes.add(shapeNew);
        shapeNew = new Square("Square1", 2);
        existingShapes.add(shapeNew);
        shapeNew = new Square("Square2", 3);
        existingShapes.add(shapeNew);
        shapeNew = new Rectangle("Rectangle1", 2,3);
        existingShapes.add(shapeNew);
        shapeNew = new Rectangle("Rectangle2", 3,4);
        existingShapes.add(shapeNew);
        System.out.println("Existing shapes:");
        for (Shape shape : existingShapes) {
            System.out.println(shape.getShapeTitle() + "   " + shape.getShapeProperties());
        }
        Square squareNew = new Square("Square2", 3);
        System.out.println("");
        System.out.println("New shape:");
        System.out.println(squareNew.getShapeTitle() + "   " + squareNew.getShapeProperties());
        System.out.println("");
        System.out.println("Found equal shapes:");
        for (Shape shape : shapeUtil.findEquals(existingShapes, squareNew)) {
            System.out.println(shape.getShapeTitle() + "   " + shape.getShapeProperties());
        }

        System.out.println("==========================================================");
    }

}
