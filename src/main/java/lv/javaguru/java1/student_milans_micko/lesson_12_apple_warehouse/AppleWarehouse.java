package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    public List<Apple> findGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("green")) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> findRedApples() {
        List<Apple> redApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals("red")) {
                redApples.add(apple);
            }
        }
        return redApples;
    }

    public List<Apple> findApplesByColor(String color) {
        List<Apple> colorApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getColor().equals(color)) {
                colorApples.add(apple);
            }
        }
        return colorApples;
    }

    public List<Apple> findApplesHeavierThen(int weight) {
        List<Apple> heavierApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                heavierApples.add(apple);
            }
        }
        return heavierApples;
    }

    public List<Apple> findApplesByColorAndWeight(String color, int weight) {
        List<Apple> colorWeightApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight &&
            apple.getColor().equals(color)) {
                colorWeightApples.add(apple);
            }
        }
        return colorWeightApples;
    }

    public List<Apple> findApples(AppleSearchCriteria searchCriteria) {
        List<Apple> searchApples = new ArrayList<>();
        for (Apple apple : apples) {
            if (searchCriteria.test(apple)) {
                searchApples.add(apple);
            }
        }
        return searchApples;
    }

    List<Apple> findApplesInterfaceSearch(AppleSearchCriteria searchCriteria, List<Apple> apples){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: apples){
            if (searchCriteria.test(apple)){
                result.add(apple);
            }
        }return result;
    }


    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

}
