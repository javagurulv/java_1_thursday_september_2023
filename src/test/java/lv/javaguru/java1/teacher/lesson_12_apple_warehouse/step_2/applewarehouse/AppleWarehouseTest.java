package lv.javaguru.java1.teacher.lesson_12_apple_warehouse.step_2.applewarehouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {

    @Test
    public void shouldFindGreenApples() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> greenApples = warehouse.findGreenApples();
        assertEquals(greenApples.size(), 3);
    }

}