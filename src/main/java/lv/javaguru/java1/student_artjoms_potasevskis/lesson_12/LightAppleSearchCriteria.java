package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;



public class LightAppleSearchCriteria implements AppleSearchCriteria {

    public boolean test (Apple apple) {
        return apple.getWeight() < 150;
    }


}
