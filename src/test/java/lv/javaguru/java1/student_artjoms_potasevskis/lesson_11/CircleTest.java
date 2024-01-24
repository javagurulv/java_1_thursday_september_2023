package lv.javaguru.java1.student_artjoms_potasevskis.lesson_11;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
  public void shouldCalculateArea(){

        Circle circle = new Circle("A",1);
        assertEquals(circle.calculateArea(), 3.14,0.01);
    }
    @Test
    public void shouldCalculatePerimeter( ){

        Circle circle = new Circle("A",1);
        assertEquals(circle.calculatePerimeter(),6.28, 0.01);
    }
}
