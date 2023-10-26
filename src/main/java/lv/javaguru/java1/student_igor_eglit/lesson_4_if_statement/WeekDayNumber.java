package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement;

import java.util.Scanner;

public class WeekDayNumber {
    public static void main(String[] args) {

        System.out.print("Ввод: ");
        var day = new Scanner(System.in).nextInt();
        String weekday;
        if (day == 1) {
            weekday = "Monday";
        } else if (day == 2) {
            weekday = "Tuesday";
        } else if (day == 3) {
            weekday = "Wednesday";
        } else if (day == 4) {
            weekday = "Thurday";
        } else if (day == 5) {
            weekday = "Friday";
        } else if (day == 6) {
            weekday = "Saterday";
        } else if (day == 7) {
            weekday = "Sunday";
        } else {
            weekday = ("номер дня неделе должен быть от 1 до 7 включительно");
        }
        System.out.println("Вывод: " + weekday);
    }
}
