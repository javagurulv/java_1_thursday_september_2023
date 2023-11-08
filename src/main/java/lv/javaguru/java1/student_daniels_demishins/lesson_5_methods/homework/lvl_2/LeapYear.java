package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.homework.lvl_2;

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
