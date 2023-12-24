package lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_10.applewarehouse;

class HeavyAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }
}
