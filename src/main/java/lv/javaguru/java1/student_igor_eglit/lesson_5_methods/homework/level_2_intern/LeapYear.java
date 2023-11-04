package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_2_intern;

class LeapYear {
    public String year(int numberYear) {
        return isLeap(numberYear) ? numberYear + " Год високосный" : numberYear + " Год невисокосный";
    }
    boolean isLeap(int numberYear) {
        return (numberYear % 400 == 0) || ((numberYear % 100 != 0 && (numberYear % 4 == 0)));
    }
}
