package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class ShapeUtil {

    Random rand = new Random();

    Circle createRandomCircle(){
        double rand_r = rand.nextDouble();
        return new Circle("Circle1", rand_r);

    }

    Square createRandomSquare(){
        double rand_s = rand.nextDouble();
        return new Square("Square1", rand_s);
    }

    Rectangle createRandomRectangle(){
        double rand_s1 = rand.nextDouble();
        double rand_s2 = rand.nextDouble();
        return new Rectangle("Rectangle1", rand_s1, rand_s2);

    }

    Shape createRandomShape() {
        int randomInt = rand.nextInt(3);
        if (randomInt == 0) {
            return createRandomCircle();
        } else if (randomInt == 1) {
            return createRandomSquare();
        } else if (randomInt == 2) {
            return createRandomRectangle();
        } else return null;
    }

    double calculateArea(Shape[] shapes) {
        double totalShapeArea = 0;
        for(int i = 0; i < shapes.length; i++) {
            totalShapeArea = totalShapeArea + shapes[i].calculateArea();
        }
        return totalShapeArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalShapePerimeter = 0;
        for(int i = 0; i < shapes.length; i++) {
            totalShapePerimeter = totalShapePerimeter + shapes[i].calculatePerimeter();
        }
        return totalShapePerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    List<Shape> findEquals(List<Shape> allShapes, Shape shapeToCompare) {
        List<Shape> equalShapes = new ArrayList<>();
        for (Shape shape : allShapes) {
            if (shapeToCompare.equals(shape)) {
                equalShapes.add(shape);
            }
        }
        return equalShapes;
    }

}
