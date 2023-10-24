package lv.javaguru.java1.student_valera_kovs.lesson_2_variables;

import lv.javaguru.java1.student_valera_kovs.lesson_2_variables.Robot;

public class robot2 {
    public static void main(String[] args) {
        Robot Andrew = new Robot("Andrew");
        Robot Alex = new Robot("Alex");
        System.out.println("Robot1 =" + Andrew.name);
        System.out.println("Robot2 =" + Alex.name);
    }
}
