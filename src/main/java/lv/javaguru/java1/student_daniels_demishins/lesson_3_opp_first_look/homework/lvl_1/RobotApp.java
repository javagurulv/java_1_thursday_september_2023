package lv.javaguru.java1.student_daniels_demishins.lesson_3_opp_first_look.homework.lvl_1;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Bibba");
        Robot robot2 = new Robot("Bobba");

        System.out.println("Robot 1 name is " + robot1.getName());
        System.out.println("Robot 2 name is " + robot2.getName());

        robot1.setName("Bubba");
        robot2.setName("Dudda");

        System.out.println("Robot 1 name is " + robot1.getName());
        System.out.println("Robot 2 name is " + robot2.getName());
    }
}
