package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.List;


class Apple {
    private String color;
    private int weight;
    List<Apple> lightApples;
    List<Apple> heavyApples;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple(List<Apple> lightApples, List<Apple> heavyApples) {
        this.lightApples = lightApples;
        this.heavyApples = heavyApples;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public List<Apple> getLightApples() {
        return lightApples;
    }

    public List<Apple> getHeavyApples() {
        return heavyApples;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Apple) {
//            Apple other = (Apple) obj;
//            return this.weight == (other.weight) && this.getWeight() == other.getWeight();
//        }
//        return false;
//    }

}

