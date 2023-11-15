package lv.javaguru.java1.student_milans_micko.lesson_5_methods.homework.lvl2;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();

        System.out.println(leapYear.leapYear(1904));
        System.out.println(leapYear.leapYear(2000));
        System.out.println(leapYear.leapYear(1900));
    }
}
