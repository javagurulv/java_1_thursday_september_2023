package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {
    @Test
    void findApplesWithColorGreen() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> stockByColorGreen = appleWarehouse.findAppleByColor(apples, "green");
        assertEquals(7, stockByColorGreen.size(), "тест- количество зеленых яблок на складе");
    }

    @Test
    void findApplesWithColorRed() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> stockByColorRed = appleWarehouse.findAppleByColor(apples, "red");
        assertEquals(5, stockByColorRed.size(), "тест- количество красных яблок на складе");
    }

    @Test
    void separationByHeavyWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        Apple separatedApples = appleWarehouse.separationByWeight(apples, 150);
        var heavy = separatedApples.heavyApples;
        assertEquals(6, heavy.size(), "тест - нахождение тяжелых яблок");
    }

    @Test
    void separationByLightWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        Apple separatedApples = appleWarehouse.separationByWeight(apples, 150);
        var light = separatedApples.lightApples;
        assertEquals(9, light.size(), "тест - нахождение легких яблок");
    }

    @Test
    void findByParametersOnlyColorTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> onlyByColor = appleWarehouse.findAppleByDifferentParameters(apples, "green", 0, 0);
        assertEquals(7, onlyByColor.size(), "тест универсальный метод - только по цвету");
    }

    @Test
    void findByParametersOnlyWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> onlyByWeight = appleWarehouse.findAppleByDifferentParameters(apples, "", 0, 150);
        assertEquals(8, onlyByWeight.size(), "тест универсальный метод - только по весу");
    }

    @Test
    void findByParametersColorAndWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byColorAndWeight = appleWarehouse.findAppleByDifferentParameters(apples, "green", 0, 150);
        assertEquals(5, byColorAndWeight.size(), "тест универсальный метод - по цвету и весу");
    }

    @Test
    void interfaceCriteriaGreenTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new GreenAppleSearchCriteria(), apples);
        assertEquals(7, byInterfaceCriteria.size(), "тест поиска через интерфейс критерий - green");
    }

    @Test
    void interfaceCriteriaRedTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new RedAppleSearchCriteria(), apples);
        assertEquals(5, byInterfaceCriteria.size(), "тест поиска через интерфейс критерий - red");
    }

    @Test
    void interfaceCriteriaHeavyTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new HeavyAppleSearchCriteria(), apples);
        assertEquals(6, byInterfaceCriteria.size(), "тест поиска через интерфейс критерий - heavy");
    }

    @Test
    void interfaceCriteriaLightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new LightAppleSearchCriteria(), apples);
        assertEquals(9, byInterfaceCriteria.size(), "тест поиска через интерфейс критерий - light");
    }

    @Test
    void interfaceCriteriaHeavyAndGreenTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new GreenHeavySearchCriteria(), apples);
        assertEquals(2, byInterfaceCriteria.size(), "тест поиска через интерфейс критерий - green and heavy");
    }

    @Test
    void annonymClassCriteria() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> redApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getAppleColor());
            }
        }, apples);
        assertEquals(5, redApples.size(), "тест красных яблок через анонимный класс критериев");
        List<Apple> greenApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getAppleColor());
            }
        }, apples);
        assertEquals(7, greenApples.size(), "тест зеленых яблок через анонимный класс критериев");
        List<Apple> heavyApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return (apple.getWeight() > 150);
            }
        }, apples);
        assertEquals(6, heavyApples.size(), "тест тяжелых яблок через анонимный класс критериев");
        List<Apple> lightApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {return (apple.getWeight() <= 150);
            }
        }, apples);
        assertEquals(9, lightApples.size(), "тест легких яблок через анонимный класс критериев");

    }


    private static List<Apple> makeAppleStock() {
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
