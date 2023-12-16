package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    @Test
    void circleCalculationTest() {
        Circle circle = new Circle(1);
        var p = circle.perimeterRoomCalculator();
        var s = circle.squareRoomCalculator();
        assertEquals(3.14,s, "squareCircleTest");
        assertEquals(6.28, p, "perimeterCircleTest");
    }

}