package lv.javaguru.java1.student_milans_micko.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void circleCalculateArea() {
        Circle circle = new Circle("A", 1);
        assertEquals(circle.calculateArea(),3.141592653589793, 0.01);
    }
    @Test
    public void circleCalculatePerimeter() {
        Circle circle = new Circle("A", 1);
        assertEquals(circle.calculatePerimeter(),6.283185307179586, 0.01);
    }

}