package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeUtilTest {
    @Test
    void shapesCalculationTest1() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("Circle", 1),
                new Square("Square", 1),
                new Rectangle("Rectangle", 2, 3)
        };
        assertEquals(10.14, shapeUtil.calculateArea(shapes), "Array area calculation test");
    }

    @Test
    void shapesCalculationTest2() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("Circle", 1),
                new Square("Square", 1),
                new Rectangle("Rectangle", 2, 3)
        };
        assertEquals(20.28, shapeUtil.calculatePerimeter(shapes), "Array perimeter calculation test");
    }
}