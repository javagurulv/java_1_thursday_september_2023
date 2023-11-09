package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl2;

import lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl1.FizzBuzz;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();

        System.out.println(leapYear.leapYear(1904));
        System.out.println(leapYear.leapYear(2000));
        System.out.println(leapYear.leapYear(1900));
    }
}
