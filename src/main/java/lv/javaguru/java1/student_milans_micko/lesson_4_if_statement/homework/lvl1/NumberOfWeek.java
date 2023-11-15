package lv.javaguru.java1.student_milans_micko.lesson_4_if_statement.homework.lvl1;

import java.util.Scanner;

public class NumberOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number (1-7) : ");
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
            System.out.println("Sunday");
        } else if (dayNumber == 7) {
            System.out.println("Saturday");
        }

    }
}
