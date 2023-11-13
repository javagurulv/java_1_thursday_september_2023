package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_5.homework;


public class LeapYearChecker {
    public static void main(String[] args) {

        System.out.println(isLeapYear(2000)); // Високосный
        System.out.println(isLeapYear(2020)); // Високосный
        System.out.println(isLeapYear(2100)); // Не високосный
        System.out.println(isLeapYear(2022)); // Не високосный
        System.out.println(isLeapYear(2024)); // Високосный
    }

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
