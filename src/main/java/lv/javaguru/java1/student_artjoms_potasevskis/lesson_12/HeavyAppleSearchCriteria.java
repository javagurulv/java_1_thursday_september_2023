package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;



public class HeavyAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;
    }


}
