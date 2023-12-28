package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {

/*    public List<Apple> findGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("green")) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }
*/
    @Test
    public void findGreenApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findGreenApples();
        assertEquals(greenApples.size(),3);
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");
    }

    @Test
    public void findRedApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> redApples = appleWarehouse.findRedApples();
        assertEquals(redApples.size(),3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");
    }

    @Test
    public void findYellowApplesByColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> yellowApples = appleWarehouse.findApplesByColor("yellow");
        assertEquals(yellowApples.size(),2);
        assertEquals(yellowApples.get(0).getColor(), "yellow");
        assertEquals(yellowApples.get(1).getColor(), "yellow");
    }

    @Test
    public void findRedApplesByColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> redApples = appleWarehouse.findApplesByColor("red");
        assertEquals(redApples.size(),3);
        assertEquals(redApples.get(0).getColor(), "red");
        assertEquals(redApples.get(1).getColor(), "red");
        assertEquals(redApples.get(2).getColor(), "red");
    }


    @Test
    public void findHeavyApplesByWeight() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> heavyApples = appleWarehouse.findApplesByColorAndWeight("red", 150);
        assertEquals(heavyApples.size(),2);
    }


}