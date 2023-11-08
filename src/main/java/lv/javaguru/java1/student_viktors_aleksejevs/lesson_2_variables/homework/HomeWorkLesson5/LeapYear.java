package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework.HomeWorkLesson5;

class LeapYear {
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












