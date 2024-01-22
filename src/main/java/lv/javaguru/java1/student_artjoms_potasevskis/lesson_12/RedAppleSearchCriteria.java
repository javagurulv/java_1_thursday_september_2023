package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;



public class RedAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test (Apple apple) {
        return "red".equals(apple.getColor());
    }
}
