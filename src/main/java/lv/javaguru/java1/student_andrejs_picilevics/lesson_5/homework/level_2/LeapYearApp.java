package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_2;

public class LeapYearApp {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("2020 = " + leapYear.isLeapYear(2020));
        System.out.println("2023 = " + leapYear.isLeapYear(2023));
        System.out.println("1985 = " + leapYear.isLeapYear(1985));
        System.out.println("2000 = " + leapYear.isLeapYear(2000));
    }
}
