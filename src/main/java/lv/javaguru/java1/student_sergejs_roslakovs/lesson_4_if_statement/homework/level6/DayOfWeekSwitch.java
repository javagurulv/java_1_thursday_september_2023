package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.homework.level6;

import java.util.Scanner;

class DayOfWeekSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int number = scanner.nextInt();

        // Using switch statement
        String dayOfWeekSwitch;
        switch (number) {
            case 1:
                dayOfWeekSwitch = "Monday";
                break;
            case 2:
                dayOfWeekSwitch = "Tuesday";
                break;
            case 3:
                dayOfWeekSwitch = "Wednesday";
                break;
            case 4:
                dayOfWeekSwitch = "Thursday";
                break;
            case 5:
                dayOfWeekSwitch = "Friday";
                break;
            case 6:
                dayOfWeekSwitch = "Saturday";
                break;
            case 7:
                dayOfWeekSwitch = "Sunday";
                break;
            default:
                dayOfWeekSwitch = "Invalid number";
                break;
        }

        System.out.println("Day of the week is: " + dayOfWeekSwitch);
    }
}












