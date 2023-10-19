package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class AppleApplication {

    public static void main(String[] args) {
        Apple apple1 = new Apple("Antonovka", "Red", 100);
        Apple apple2 = new Apple("Champion", "Yellow", 50);

        System.out.println("Type = " + apple1.getType());
        System.out.println("Type = " + apple2.getType());

        System.out.println("Color = " + apple1.getColor());
        System.out.println("Color = " + apple2.getColor());

        System.out.println("Weight = " + apple1.getWeight());
        System.out.println("Weight = " + apple2.getWeight());

    }

}
