package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {
    @Test
    void findApplesWithColorGreen() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = getAllApples();
        Apple testApple1 = new Apple("green");
        List<Apple> stockByColorGreen = appleWarehouse.findAppleByParameter(apples, testApple1);
        assertEquals(7, stockByColorGreen.size(), "тест- количество зеленых яблок на складе");
    }

    @Test
    void findApplesWithColorRed() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = getAllApples();
        Apple testApple2 = new Apple("red");
        List<Apple> stockByColorRed = appleWarehouse.findAppleByParameter(apples, testApple2);
        assertEquals(5, stockByColorRed.size(), "тест- количество красных яблок на складе");
    }

    private static List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green"));
        apples.add(new Apple("green"));
        apples.add(new Apple("yellow"));
        apples.add(new Apple("red"));
        apples.add(new Apple("green"));
        apples.add(new Apple("yellow"));
        apples.add(new Apple("green"));
        apples.add(new Apple("red"));
        apples.add(new Apple("green"));
        apples.add(new Apple("red"));
        apples.add(new Apple("green"));
        apples.add(new Apple("red"));
        apples.add(new Apple("yellow"));
        apples.add(new Apple("red"));
        apples.add(new Apple("green"));
        return apples;
    }

}
