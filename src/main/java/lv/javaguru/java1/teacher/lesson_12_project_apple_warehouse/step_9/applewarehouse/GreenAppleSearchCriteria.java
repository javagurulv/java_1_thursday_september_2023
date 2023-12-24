package lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_9.applewarehouse;

class GreenAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
