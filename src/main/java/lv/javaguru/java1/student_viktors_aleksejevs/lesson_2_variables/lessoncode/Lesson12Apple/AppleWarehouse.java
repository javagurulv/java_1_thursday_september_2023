package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson12Apple;

import lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple;

import java.util.ArrayList;
import java.util.List;

public class AppleWarehouse {

    private List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> apples = getAllApples();

    public List<Apple> findGreenApples() {
        List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> result = new ArrayList<>();
        for(lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple apple : apples) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> findRedApples() {
        List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> result = new ArrayList<>();
        for(lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple apple : apples) {
            if("red".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> findApplesByColor(String color) {
        List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> result = new ArrayList<>();
        for(lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple apple : apples) {
            if(apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> findApplesHeavierThen(int weight) {
        List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> result = new ArrayList<>();
        for(lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple apple : apples) {
            if(apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }


    private List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> getAllApples() {
        List<lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple> apples = new ArrayList<>();
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("red", 100));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("red", 160));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("red", 200));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("green", 200));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("green", 90));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("green", 50));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("yellow", 50));
        apples.add(new lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse.Apple("yellow", 170));
        return apples;
    }

}
