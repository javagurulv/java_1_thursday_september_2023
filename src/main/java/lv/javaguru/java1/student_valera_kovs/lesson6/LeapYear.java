package lv.javaguru.java1.student_valera_kovs.lesson6;

public class LeapYear {

    public boolean isLeap(int numberYear) {
        return (numberYear % 400 == 0) || ((numberYear % 100 != 0 && (numberYear % 4 == 0)));
    }

}
