package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_1.task_2;

public class LightApp {
    public static void main(String[] args) {

        Light light = new Light();

        System.out.println(light.getColor(500));
        System.out.println(light.getColor(400));
        System.out.println(light.getColor(300));
        System.out.println(light.getColor(600));
        System.out.println(light.getColor(550));
        System.out.println(light.getColor(-500));

    }
}
