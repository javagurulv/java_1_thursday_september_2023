package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.lessoncode.homework;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ввод: ");
        int number = scanner.nextInt();

        String dayOfWeek;

        if (number == 1) {
            dayOfWeek = "Monday";
        } else if (number == 2) {
            dayOfWeek = "Tuesday";
        } else if (number == 3) {
            dayOfWeek = "Wednesday";
        } else if (number == 4) {
            dayOfWeek = "Thursday";
        } else if (number == 5) {
            dayOfWeek = "Friday";
        } else if (number == 6) {
            dayOfWeek = "Saturday";
        } else if (number == 7) {
            dayOfWeek = "Sunday";
        } else {
            dayOfWeek = "Invalid input";
        }

        System.out.println("Вывод: " + dayOfWeek);
    }
}






