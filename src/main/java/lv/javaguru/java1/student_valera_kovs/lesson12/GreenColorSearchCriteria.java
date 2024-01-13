package lv.javaguru.java1.student_valera_kovs.lesson12;

class GreenColorSearchCriteria implements AppleSearchCriteria {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }
}

