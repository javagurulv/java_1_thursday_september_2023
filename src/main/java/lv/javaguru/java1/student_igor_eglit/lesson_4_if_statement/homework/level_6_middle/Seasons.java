package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

class Seasons {
    public static void main(String[] args) {
        System.out.print("Введите номер месяца 1-12: ");
        var monthNumber = new Scanner(System.in).nextInt();
        String season;
        switch (monthNumber) {
            case 12, 1, 2:
                season = "Winter";
                break;
            case 3, 4, 5:
                season = "Spring";
                break;
            case 6, 7, 8:
                season = "Summer";
                break;
            case 9, 10, 11:
                season = "Autumn";
                break;
            default:
                season = "Номер месяца должен быть от 1 до 12 включительно";
        }
        System.out.println("Season " + season);
    }
}