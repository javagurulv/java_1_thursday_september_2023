package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_2;

public class LeapYear {

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
