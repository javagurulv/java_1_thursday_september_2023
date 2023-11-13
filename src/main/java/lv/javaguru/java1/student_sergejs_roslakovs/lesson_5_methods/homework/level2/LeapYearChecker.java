package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level2;

class LeapYearChecker {

    public boolean isLeapYear(int year) {
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        return isLeapYear = isLeapYear && (year % 100 != 0 || year % 400 == 0);
    }

}





