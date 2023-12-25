package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppleWarehouseTest {
    @Test
    void findApplesWithColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
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
        Apple testApple = new Apple("green");
        List<Apple> stockByColorGreen = appleWarehouse.findAppleByColor(apples, testApple);
        assertEquals(7,stockByColorGreen.size(),"тест- количество зеленых яблок на складе");
    }

}
