package lv.javaguru.java1.student_danil_sitiakov.lesson_5;

public class LeapYearApp {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("2000 " + leapYear.Year(2000));
        System.out.println("2001 " + leapYear.Year(2001));
        System.out.println("1996 " + leapYear.Year(1996));
        System.out.println("1997 " + leapYear.Year(1997));
    }
}
