package lv.javaguru.java1.student_jelena_vavere.lesson_3_oop_first_look.homework;

public class RobotApplication {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Philips");
        Robot robot2 = new Robot("Elektrolux");

        System.out.println("Name = " + robot1.getName());
        System.out.println("Name = " + robot2.getName());

    }
}
