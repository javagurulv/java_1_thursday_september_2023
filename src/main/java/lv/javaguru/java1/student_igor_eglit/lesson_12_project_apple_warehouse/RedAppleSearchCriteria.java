package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

class RedAppleSearchCriteria implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
