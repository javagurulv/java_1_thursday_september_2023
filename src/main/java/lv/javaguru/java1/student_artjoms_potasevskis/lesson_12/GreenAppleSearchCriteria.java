package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;



public class GreenAppleSearchCriteria implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }



}
