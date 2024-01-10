package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    public void rectangleCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("A", 1, 4);
        assertEquals(rectangle.calculatePerimeter(), 10.0, 4);
    }
    @Test
    public void rectangleCalculateArea() {
        Rectangle rectangle = new Rectangle("A", 1, 4);
        assertEquals(rectangle.calculateArea(), 1.0, 4);
    }



}