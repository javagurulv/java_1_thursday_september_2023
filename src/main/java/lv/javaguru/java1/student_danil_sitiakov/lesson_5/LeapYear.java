package lv.javaguru.java1.student_danil_sitiakov.lesson_5;

class LeapYear {


    boolean isYear(int numA) {
        return numA % 4 == 0;
    }

    protected String Year(int a) {
        if (isYear(a)) {
            return "Year is leap";
        } else {
            return "Year is not leap";
        }
    }
}
