package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class AppleApp {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Antonovka","Red", 50);
        Apple apple2 = new Apple("Champion","White", 100);

        System.out.println("Type = " + apple1.getType());
        System.out.println("Type = " + apple2.getType());

        System.out.println("Color = " + apple1.getColor());
        System.out.println("Color = " + apple2.getColor());

        System.out.println("Weight = " + apple1.getWeight());
        System.out.println("Weight = " + apple2.getWeight());
    }
}
