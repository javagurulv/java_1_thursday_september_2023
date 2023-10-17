package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_1_intern.task_1;

import java.util.Scanner;

class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter day number (from 1 to 7): ");
        int dayNumber = scanner.nextInt();

        if (dayNumber == 1) {
            System.out.println("Monday");
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
        } else if (dayNumber == 5) {
            System.out.println("Friday");
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Unknown day!!! Please enter number from 1 to 7!");
        }
    }

}
