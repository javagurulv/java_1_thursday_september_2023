package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_2_intern;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear findOutLeap = new LeapYear();
        System.out.println(findOutLeap.year(2020));
        System.out.println(findOutLeap.year(1924));
        System.out.println(findOutLeap.year(1978));
        System.out.println(findOutLeap.year(2001));
        System.out.println(findOutLeap.year(2005));
    }
}
