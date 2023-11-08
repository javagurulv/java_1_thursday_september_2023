package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_3;

public class Tax {
    public double getTax(int number) {
        if (number < 10000) {
            return number * 0.3;
        } else if (number <= 50000) {
            return number * 0.4;
        } else {
            return number * 0.5;
        }
    }
}

