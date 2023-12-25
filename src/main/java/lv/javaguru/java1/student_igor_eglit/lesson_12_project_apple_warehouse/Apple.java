package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.List;
import java.util.Objects;

class Apple {
    String appleColor;
    int weight;
    List<Apple> lightApples;


    List<Apple> heavyApples;


    public Apple(String appleColor, int weight) {
        this.appleColor = appleColor;
        this.weight = weight;
    }


    public String getAppleColor() {
        return appleColor;
    }

    public int getWeight() {
        return weight;
    }
    public Apple(List<Apple> lightApples, List<Apple> heavyApples) {
        this.lightApples = lightApples;
        this.heavyApples = heavyApples;
    }

    public List<Apple> getLightApples() {
        return lightApples;
    }

    public List<Apple> getHeavyApples() {
        return heavyApples;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Apple) {
            Apple other = (Apple) obj;
            return this.weight == (other.weight) && this.getWeight() == other.getWeight();
        }
        return false;
    }

}

