package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level3;

class ProgressiveTax {
    public static String getTax(double money) {
        if (tax30(money)) {
            return "30% tax money: " + (money * 0.3);
        }
        else if (tax40(money)) {
            return "40% tax money: " + (money * 0.4);
        }
        else if (tax50(money)) {
            return "50% tax money: " + (money * 0.5);
        }
        else {
            return "";
        }
    }
    static boolean tax30(double money) {
        return money < 10000;
    }
    static boolean tax40(double money) {
        return money >= 10000 && money < 50000;
    }
    static boolean tax50(double money) {
        return money >= 50000;
    }


}
