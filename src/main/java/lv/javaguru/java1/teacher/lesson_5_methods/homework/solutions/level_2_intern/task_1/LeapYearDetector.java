package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_2_intern.task_1;

class LeapYearDetector {

    public boolean isLeapYear(int number) {
        boolean isLeapYear = false;
        if (number % 4 == 0) {
            if (number % 100 != 0) {
                isLeapYear = true;
            } else if (number % 400 == 0) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }

}