package lv.javaguru.java1.student_valera_kovs.lesson12;



import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    public List<Apple> findGreenApples() {
        List<Apple> greenApples = new ArrayList<>();
        for(Apple apple : apples) {
            if("green".equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public List<Apple> findRedApples() {
        List<Apple> redApples = new ArrayList<>();
        for(Apple apple : apples) {
            if("red".equals(apple.getColor())) {
                redApples.add(apple);
            }
        }
        return redApples;
    }

    public List<Apple> findApplesByColor(String color) {
        List<Apple> applesColor = new ArrayList<>();
        for(Apple apple : apples) {
            if(apple.getColor().equals(color)) {
                applesColor.add(apple);
            }
        }
        return applesColor;
    }
    public List<Apple> findApplesByWeight(int weight) {
        List<Apple> weightApples = new ArrayList<>();
        for(Apple apple : apples) {
            if(apple.getWeight() >= weight) {
                weightApples.add(apple);
            }
        }
        return weightApples;
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




    


