package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

class GreenHeavySearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150 && apple.appleColor.equals("green");
    }
}
