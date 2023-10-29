package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lesson3homework;

public class RobotApp {

    public static void main(String[] args) {

        Robot name1 = new Robot("Chappi");
        Robot name2 = new Robot("Bee");

        System.out.println("name1 =" + name1.getName());
        System.out.println("name2 =" + name2.getName());

        name1.setName("MrChappi");
        name2.setName("BumbleBee");

        System.out.println("name1 =" + name1.getName());
        System.out.println("name2 =" + name2.getName());
    }
}
