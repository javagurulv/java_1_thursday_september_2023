package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework;

import java.util.Scanner;

class SwitchDayNumber {
    public static void main(String[] args) {
        System.out.print("Enter a day dayNumber from 1 to 7: ");
        var dayNumber = new Scanner(System.in).nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName="Day number must from 1 to 7!";
    }
        System.out.println(dayName);
}
    }