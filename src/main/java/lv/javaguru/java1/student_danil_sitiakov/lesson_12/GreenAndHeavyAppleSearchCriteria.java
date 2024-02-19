package lv.javaguru.java1.student_danil_sitiakov.lesson_12;

class GreenAndHeavyAppleSearchCriteria implements AppleSearchCriteria {

    private GreenAppleSearchCriteria greenApples = new GreenAppleSearchCriteria();
    private HeavyAppleSearchCriteria heavyApples = new HeavyAppleSearchCriteria();

    @Override
    public boolean test(lv.javaguru.java1.teacher.lesson_12_project_apple_warehouse.step_13.applewarehouse.Apple apple) {
        return greenApples.test(apple) && heavyApples.test(apple);
    }

}