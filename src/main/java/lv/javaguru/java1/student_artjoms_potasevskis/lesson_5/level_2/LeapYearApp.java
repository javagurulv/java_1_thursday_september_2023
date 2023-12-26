package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_2;

public class LeapYearApp {

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("1000 = " + leapYear.isLeapYear(1000));
        System.out.println("1001 = " + leapYear.isLeapYear(1001));
        System.out.println("1200 = " + leapYear.isLeapYear(1200));
        System.out.println("1300 = " + leapYear.isLeapYear(1300));
    }

}
