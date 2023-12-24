package lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_12.applewarehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
