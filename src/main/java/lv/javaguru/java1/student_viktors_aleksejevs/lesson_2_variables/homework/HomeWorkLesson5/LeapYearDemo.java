package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson5;

public class LeapYearDemo {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        System.out.println("1582 = " + leapYear.isLeapYear(1582));
        System.out.println("1988 = " + leapYear.isLeapYear(1988));
        System.out.println("1620 = " + leapYear.isLeapYear(1620));
        System.out.println("2022 = " + leapYear.isLeapYear(2022));


    }
}
