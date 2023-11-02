package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_2_intern.task_1;

class LeapYearDemo {

    public static void main(String[] args) {
        LeapYearDetector leapYearDetector = new LeapYearDetector();
        System.out.println("1000 = " + leapYearDetector.isLeapYear(1000));
        System.out.println("1001 = " + leapYearDetector.isLeapYear(1001));
        System.out.println("1200 = " + leapYearDetector.isLeapYear(1200));
        System.out.println("1300 = " + leapYearDetector.isLeapYear(1300));
    }

}
