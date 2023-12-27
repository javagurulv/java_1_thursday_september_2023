package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeUtilTest {

    @Test
    public void shouldCalculateTotalArea() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("A", 2),
                new Square("B", 2),
                new Rectangle("C", 2, 3)
        };
        assertEquals(22.56636, shapeUtil.calculateArea(shapes));
    }
    @Test
    public void shouldCalculateTotalPerimeter() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("A", 2),
                new Square("B", 2),
                new Rectangle("C", 2, 3)
        };
        assertEquals(30.56636, shapeUtil.calculatePerimeter(shapes));
    }


}
