package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson12Apple;

import lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_10.applewarehouse.Apple;
import lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_10.applewarehouse.AppleSearchCriteria;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
