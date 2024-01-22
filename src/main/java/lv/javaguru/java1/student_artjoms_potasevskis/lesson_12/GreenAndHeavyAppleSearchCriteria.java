package lv.javaguru.java1.student_artjoms_potasevskis.lesson_12;



class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApples = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApples = new HeavyAppleSearchCriteria();

    @Override
    public boolean test(Apple apple) {
        return greenApples.test(apple) && heavyApples.test(apple);
    }




}
