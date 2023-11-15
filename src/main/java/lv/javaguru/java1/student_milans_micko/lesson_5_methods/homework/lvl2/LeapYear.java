package lv.javaguru.java1.student_milans_micko.lesson_5_methods.homework.lvl2;

public class LeapYear {
    String leapYear(int number) {
        if (number % 4 != 0) {
            return number + " is not a leap year";
        } else if (number % 100 == 0) {
            return number % 400 == 0 ? number + " is a leap year" : number + " is not a leap year";
        }
        return number + " is not a leep year";
    }
}