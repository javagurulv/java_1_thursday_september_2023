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
        Apple testApple1 = new Apple("green", 149);
        List<Apple> stockByColorGreen = appleWarehouse.findAppleByColor(apples, testApple1);
        assertEquals(7, stockByColorGreen.size(), "тест- количество зеленых яблок на складе");
    }

    @Test
    void findApplesWithColorRed() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = getAllApples();
        Apple testApple2 = new Apple("red", 151);
        List<Apple> stockByColorRed = appleWarehouse.findAppleByColor(apples, testApple2);
        assertEquals(5, stockByColorRed.size(), "тест- количество красных яблок на складе");
    }

    @Test
    void separationByHeavyWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = getAllApples();
        Apple separatedApples = appleWarehouse.separationByWeight(apples);
        var heavy = separatedApples.heavyApples;
       assertEquals(7,heavy.size(),"тест - нахождение тяжелых яблок");
    }
    @Test
    void separationByLightWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = getAllApples();
        Apple separatedApples = appleWarehouse.separationByWeight(apples);
        var light = separatedApples.lightApples;
        assertEquals(8,light.size(),"тест - нахождение легких яблок");
    }
    private static List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("green", 149));
        apples.add(new Apple("green", 120));
        apples.add(new Apple("yellow", 130));
        apples.add(new Apple("red", 151));
        apples.add(new Apple("green", 160));
        apples.add(new Apple("yellow", 190));
        apples.add(new Apple("green", 110));
        apples.add(new Apple("red", 90));
        apples.add(new Apple("green", 210));
        apples.add(new Apple("red", 170));
        apples.add(new Apple("green", 100));
        apples.add(new Apple("red", 110));
        apples.add(new Apple("yellow", 180));
        apples.add(new Apple("red", 150));
        apples.add(new Apple("green", 140));
        return apples;
    }

}
