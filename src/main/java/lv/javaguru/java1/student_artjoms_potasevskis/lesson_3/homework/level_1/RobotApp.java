package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.homework.level_1;

import lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.homework.level_1.Robot;

public class RobotApp {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Artjom");
        Robot robot2 = new Robot("Demid");

        System.out.println("Robot 1 name = " + robot1.getName());
        System.out.println("Robot 2 name = " + robot2.getName());

        robot1.setName("Nikita");
        robot2.setName("Kirill");

        System.out.println("Robot 1 name = " + robot1.getName());
        System.out.println("Robot 2 name = " + robot2.getName());



    }



}
