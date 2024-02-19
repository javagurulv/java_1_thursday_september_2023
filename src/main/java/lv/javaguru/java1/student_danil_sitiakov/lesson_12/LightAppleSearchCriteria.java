package lv.javaguru.java1.student_danil_sitiakov.lesson_12;

class LightAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test (lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_13.applewarehouse.Apple apple) {
        return apple.getWeight() < 150;
    }
}
