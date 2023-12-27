package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle("Rectangle1", 2, 3);
        assertEquals(6, rectangle.calculateArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle1", 2,3);
        assertEquals(10, rectangle.calculatePerimeter());
    }




}
