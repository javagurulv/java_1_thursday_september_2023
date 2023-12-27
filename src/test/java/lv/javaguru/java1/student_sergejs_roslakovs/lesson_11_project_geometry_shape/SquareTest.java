package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldCalculateArea() {
        Square square = new Square("Square1", 2);
        assertEquals(4, square.calculateArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Square square = new Square("Square1", 2);
        assertEquals(8, square.calculatePerimeter());
    }
}
