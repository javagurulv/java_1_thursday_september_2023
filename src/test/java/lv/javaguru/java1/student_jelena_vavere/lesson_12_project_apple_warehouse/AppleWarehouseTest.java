package lv.javaguru.java1.student_jelena_vavere.lesson_12_project_apple_warehouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {
    private AppleWarehouse warehouse = new AppleWarehouse();

    @Test
    public void shouldFindGreenApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = warehouse.findGreenApples();
        assertEquals(greenApples.size(), 3);
        assertEquals(greenApples.get(0).getWeight(), "green");
        assertEquals(greenApples.get(1).getWeight(), "green");
        assertEquals(greenApples.get(2).getWeight(), "green");

    }

    @Test
    public void shouldFindRedApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> redApples = appleWarehouse.findRedApples();
        assertEquals(redApples.size(), 3);
        assertEquals(redApples.get(0).getWeight(), "red");
        assertEquals(redApples.get(1).getWeight(), "red");
        assertEquals(redApples.get(2).getWeight(), "red");

    }

    @Test
    public void shouldFindYellowApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> yellowApples = appleWarehouse.findYellowApples();
        assertEquals(yellowApples.size(), 2);
        assertEquals(yellowApples.get(0).getWeight(), "yellow");
        assertEquals(yellowApples.get(1).getWeight(), "yellow");

    }

    @Test
    public void shouldFindApplesByColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> redApples = appleWarehouse.findApplesByColor("red");
        assertEquals(redApples.size(), 3);
        List<Apple> greenApples = appleWarehouse.findApplesByColor("green");
        assertEquals(redApples.size(), 3);

    }

    // @Test
   /* public void shouldFindApplesByColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findApplesByColor("green");
        assertEquals(greenApples.size(), 3);
        assertEquals(greenApples.get(0).getColor(), "green");
        assertEquals(greenApples.get(1).getColor(), "green");
        assertEquals(greenApples.get(2).getColor(), "green");
    }
    */

    @Test
    public void shouldFindApplesHeavyApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple>heavyApples = appleWarehouse.findApplesByWeight(150);
        assertEquals(heavyApples.size(), 4);
    }

    @Test
    public void shouldFindApplesHeavyRedApples() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple>heavyRedApples = appleWarehouse.findApplesByColorAndWeight( "red" , 150);
        assertEquals(heavyRedApples.size(), 2);
    }

}


