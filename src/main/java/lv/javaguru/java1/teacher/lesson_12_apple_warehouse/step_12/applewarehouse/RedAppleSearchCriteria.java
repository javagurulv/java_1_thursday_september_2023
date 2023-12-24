package lv.javaguru.java1.teacher.lesson_12_apple_warehouse.step_12.applewarehouse;

class RedAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
