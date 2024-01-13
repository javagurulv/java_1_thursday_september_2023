package lv.javaguru.java1.student_milans_micko.lesson_12_apple_warehouse;

class GreenHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApples = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApples = new HeavyAppleSearchCriteria();

    @Override
    public boolean test(Apple apple) { return greenApples.test(apple) && heavyApples.test(apple); }
}
