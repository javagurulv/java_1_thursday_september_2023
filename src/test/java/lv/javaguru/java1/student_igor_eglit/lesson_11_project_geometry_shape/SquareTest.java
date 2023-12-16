package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void squareCalculationTest(){
        var square = new Square(1);
        var perimeter = square.perimeterRoomCalculator();
        var squareCalc= square.squareRoomCalculator();
        assertEquals(4,perimeter,"PerimeterTest");
        assertEquals(1,squareCalc,"SquareTest");
    }
    @Test
    void squareCalculationTestZero(){
        var square = new Square(0);
        var perimeter = square.perimeterRoomCalculator();
        var squareCalc = square.squareRoomCalculator();
        assertEquals(-1,perimeter,"PerimeterTest <=0");
        assertEquals(-1,squareCalc,"SquareTest <=0");
    }

}