package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) { return apple.getWeight() > 150; }
}
