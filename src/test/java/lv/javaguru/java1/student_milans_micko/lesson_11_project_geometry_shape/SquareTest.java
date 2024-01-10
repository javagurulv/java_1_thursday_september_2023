package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void squareCalculationArea() {
        Square square = new Square("A", 1);
        assertEquals(square.calculateArea(), 1.0, 0.01);
    }
    @Test
    void squareCalculationPerimeter() {
        Square square = new Square("A", 1);
        assertEquals(square.calculatePerimeter(), 4.0, 0.01);
    }

}