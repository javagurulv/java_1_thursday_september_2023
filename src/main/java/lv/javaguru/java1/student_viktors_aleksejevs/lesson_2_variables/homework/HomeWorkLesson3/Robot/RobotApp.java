package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson3.Robot;

public class RobotApp {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Robocop");
        Robot robot2 = new Robot("Kiborg");

        System.out.println("Name = " + robot1.getName());
        System.out.println("Name = " + robot2.getName());

        robot1.setName("RRRRR");
        robot2.setName("Kiborg");

        System.out.println("Robot 1 name = " + robot1.getName());
        System.out.println("Robot 2 name = " + robot2.getName());
    }
}
