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

    @Test
    public void shouldFindApplesHeavierThen() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> applesHeavierThen150 = appleWarehouse.findApplesHeavierThen(150);
        assertEquals(applesHeavierThen150.size(), 4);
    }
    @Test
    public void shouldFindAppleUsingSearchCriteria() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findApples(new GreenAppleSearchCriteria());
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = appleWarehouse.findApples(new RedAppleSearchCriteria());
        assertEquals(redApples.size(), 3);

        List<Apple> heavyApples = appleWarehouse.findApples(new HeavyAppleSearchCriteria());
        assertEquals(heavyApples.size(), 4);

        List<Apple> lightApples = appleWarehouse.findApples(new LightAppleSearchCriteria());
        assertEquals(lightApples.size(), 4);
    }
    @Test
    public void shouldFindApplesUsingAnonymousClass(){
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> greenApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        }); assertEquals(greenApples.size(), 3);

        List<Apple> redApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        }); assertEquals(redApples.size(), 3);

        List<Apple> heavyApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150 ;
            }
        }); assertEquals(heavyApples.size(), 4);

        List<Apple> lightApples = appleWarehouse.findApples(new AppleSearchCriteria() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150 ;
            }
        }); assertEquals(lightApples.size(), 4);
    }

    @Test
    public void shouldFindApplesUsingLambdaExpression() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> greenApples = warehouse.findApples(apple -> "green".equals(apple.getColor()));
        assertEquals(greenApples.size(), 3);

        List<Apple> redApples = warehouse.findApples(apple -> "red".equals(apple.getColor()));
        assertEquals(redApples.size(), 3);

        List<Apple> applesHeavierThen150 = warehouse.findApples(apple -> apple.getWeight() > 150);
        assertEquals(applesHeavierThen150.size(), 4);

        List<Apple> applesLightThen150 = warehouse.findApples(apple -> apple.getWeight() < 150);
        assertEquals(applesLightThen150.size(), 4);
    }
}