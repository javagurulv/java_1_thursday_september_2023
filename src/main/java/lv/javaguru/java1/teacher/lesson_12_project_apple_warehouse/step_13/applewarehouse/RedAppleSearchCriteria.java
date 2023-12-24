package lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_13.applewarehouse;

class RedAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
