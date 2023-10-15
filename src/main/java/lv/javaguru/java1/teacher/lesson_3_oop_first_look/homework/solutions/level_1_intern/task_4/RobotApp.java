package lv.javaguru.java1.teacher.lesson_3_oop_first_look.homework.solutions.level_1_intern.task_4;

class RobotApp {

    public static void main(String[] args) {
        Robot robot1 = new Robot("Vasja");
        Robot robot2 = new Robot("Petja");

        System.out.println("Robot 1 name = " + robot1.getName());
        System.out.println("Robot 2 name = " + robot2.getName());

        robot1.setName("Katja");
        robot2.setName("Masha");

        System.out.println("Robot 1 name = " + robot1.getName());
        System.out.println("Robot 2 name = " + robot2.getName());
    }

}
