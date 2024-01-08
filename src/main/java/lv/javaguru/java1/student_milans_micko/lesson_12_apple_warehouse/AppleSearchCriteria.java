package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

@FunctionalInterface
interface AppleSearchCriteria {

    boolean test(Apple apple);
}
