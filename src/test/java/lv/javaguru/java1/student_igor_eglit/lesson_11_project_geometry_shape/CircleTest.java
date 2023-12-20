package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {


    @Test
    void circleCalculationTest() {
        var circle = new Circle("Circle",1);
        var perimeter = circle.perimeterRoomCalculator();
        var square = circle.squareRoomCalculator();
        assertEquals(3.14,square, "squareCircleTest");
        assertEquals(6.28, perimeter, "perimeterCircleTest");
    }
    @Test
    void circleCalculationTestZero(){
        var circle = new Circle("Circle",0);
        var perimeter = circle.perimeterRoomCalculator();
        var square = circle.squareRoomCalculator();
        assertEquals(-1,square, "squareCircleTest=<0");
        assertEquals(-1, perimeter, "perimeterCircleTest=<0");
    }

}