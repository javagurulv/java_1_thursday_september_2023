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
        assertEquals(7, stockByColorGreen.size());
    }

    @Test
    void findApplesWithColorRed() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> stockByColorRed = appleWarehouse.findAppleByColor(apples, "red");
        assertEquals(5, stockByColorRed.size());
    }

    @Test
    void separationByHeavyWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        Apple separatedApples = appleWarehouse.separationByWeight(apples, 150);
        var heavy = separatedApples.heavyApples;
        assertEquals(6, heavy.size());
    }

    @Test
    void separationByLightWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        Apple separatedApples = appleWarehouse.separationByWeight(apples, 150);
        var light = separatedApples.lightApples;
        assertEquals(9, light.size());
    }

    @Test
    void findByParametersOnlyColorTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> onlyByColor = appleWarehouse.findAppleByDifferentParameters(apples, "green", 0, 0);
        assertEquals(7, onlyByColor.size());
    }

    @Test
    void findByParametersOnlyWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> onlyByWeight = appleWarehouse.findAppleByDifferentParameters(apples, "", 0, 150);
        assertEquals(8, onlyByWeight.size());
    }

    @Test
    void findByParametersColorAndWeightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byColorAndWeight = appleWarehouse.findAppleByDifferentParameters(apples, "green", 0, 150);
        assertEquals(5, byColorAndWeight.size());
    }

    @Test
    void interfaceCriteriaGreenTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new GreenAppleSearchCriteria(), apples);
        assertEquals(7, byInterfaceCriteria.size());
    }

    @Test
    void interfaceCriteriaRedTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new RedAppleSearchCriteria(), apples);
        assertEquals(5, byInterfaceCriteria.size());
    }

    @Test
    void interfaceCriteriaHeavyTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new HeavyAppleSearchCriteria(), apples);
        assertEquals(6, byInterfaceCriteria.size());
    }

    @Test
    void interfaceCriteriaLightTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new LightAppleSearchCriteria(), apples);
        assertEquals(9, byInterfaceCriteria.size());
    }

    @Test
    void interfaceCriteriaHeavyAndGreenTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> byInterfaceCriteria = appleWarehouse.findApplesInterfaceSearch(new GreenHeavySearchCriteria(), apples);
        assertEquals(2, byInterfaceCriteria.size());
    }

    @Test
    void annonymClassCriteria() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> redApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        }, apples);
        assertEquals(5, redApples.size());

        List<Apple> greenApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        }, apples);
        assertEquals(7, greenApples.size());

        List<Apple> heavyApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return (apple.getWeight() > 150);
            }
        }, apples);
        assertEquals(6, heavyApples.size());

        List<Apple> lightApples = appleWarehouse.findApplesInterfaceSearch(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return (apple.getWeight() <= 150);
            }
        }, apples);
        assertEquals(9, lightApples.size());

    }

    @Test
    void lambdaTest() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        var apples = makeAppleStock();
        List<Apple> redApples = appleWarehouse.findApplesInterfaceSearch(
                apple -> "red".equals(apple.getColor()), apples
        );
        assertEquals(5, redApples.size());

        List<Apple> greenApples = appleWarehouse.findApplesInterfaceSearch(
                apple -> "green".equals(apple.getColor()), apples
        );
        assertEquals(7, greenApples.size());

        List<Apple> heavyApples = appleWarehouse.findApplesInterfaceSearch(
                apple -> apple.getWeight() > 150, apples
        );
        assertEquals(6, heavyApples.size());

        List<Apple> lightApples = appleWarehouse.findApplesInterfaceSearch(
                apple -> apple.getWeight() <= 150, apples
        );
        assertEquals(9, lightApples.size());
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
