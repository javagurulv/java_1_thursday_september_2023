package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level2;

import java.util.Scanner;

class LeapYearCheckerApp {

    public static void main(String[] args) {

        LeapYearChecker leapYearChecker = new LeapYearChecker();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int year;
        boolean leapYear;
        while (run) {
            System.out.println("Please enter year (or 0 to exit application): ");
            year = scanner.nextInt();
            leapYear = leapYearChecker.isLeapYear(year);
            if (leapYear) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not leap year");
            }
            if (year == 0) run = false;
        }
    }


}













