package lv.javaguru.java1.student_igor_eglit.lesson_11_project_geometry_shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void rectangularCalculationTest(){
        var rectangle = new Rectangle(1,1);
        var square = rectangle.squareRoomCalculator();
        var perimeter = rectangle.perimeterRoomCalculator();
        assertEquals(4,perimeter,"PerimeterTest");
        assertEquals(1,square,"SquareTest");
    }
    @Test
    void rectangularCalculationTestZero(){
        var rectangle = new Rectangle(0, 0);
        var perimeter = rectangle.perimeterRoomCalculator();
        var square = rectangle.squareRoomCalculator();
        assertEquals(-1,perimeter,"PerimeterTest <=0");
        assertEquals(-1,square,"SquareTest <=0");
    }

}