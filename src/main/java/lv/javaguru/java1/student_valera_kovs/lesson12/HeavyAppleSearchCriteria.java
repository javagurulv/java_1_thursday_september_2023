package lv.javaguru.java1.student_valera_kovs.lesson12;


class HeavyAppleSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test (Apple apple) {
        return apple.getWeight() > 150;}
}
