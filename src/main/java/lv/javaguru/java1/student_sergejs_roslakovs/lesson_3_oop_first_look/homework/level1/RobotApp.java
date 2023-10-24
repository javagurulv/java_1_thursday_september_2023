package lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.homework.level1;

import lv.javaguru.java1.student_sergejs_roslakovs.lesson_3_oop_first_look.homework.level1.Robot;

public class RobotApp {
    public static void main(String[] args) {
        Robot john = new Robot("John");
        Robot jack = new Robot("Jack");
        System.out.println("Robot 1 = " + john.getName());
        System.out.println("Robot 2 = " + jack.getName());


    }

}
