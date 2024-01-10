package lv.javaguru.java1.student_sergejs_roslakovs.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void shouldCalculateArea() {
        Circle circle = new Circle("Circle1", 2);
        assertEquals(12.56636, circle.calculateArea());
    }

    @Test
    public void shouldCalculatePerimeter() {
        Circle circle = new Circle("Circle1", 2);
        assertEquals(12.56636, circle.calculatePerimeter());
    }




}
