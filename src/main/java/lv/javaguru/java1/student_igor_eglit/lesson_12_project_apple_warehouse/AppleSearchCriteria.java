package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

@FunctionalInterface
interface AppleSearchCriteria {
    boolean test(Apple apple);
}
