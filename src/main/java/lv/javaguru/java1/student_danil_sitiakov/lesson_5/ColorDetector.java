package lv.javaguru.java1.student_danil_sitiakov.lesson_5;

public class ColorDetector {

    boolean isViolet(int num1) {
        if (num1 >= 380 && num1 <= 449) {
            return true;
        } else {
            return false;
        }
    }

    boolean isBlue(int num2) {
        if (num2 >= 450 && num2 <= 494) {
            return true;
        } else {
            return false;
        }
    }

    boolean isGreen(int num3) {
        if (num3 >= 495 && num3 <= 569) {
            return true;
        } else {
            return false;
        }
    }

    boolean isYellow(int num4) {
        if (num4 >= 570 && num4 <= 589) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOrange(int num5) {
        if (num5 >= 590 && num5 <= 619) {
            return true;
        } else {
            return false;
        }
    }

    boolean isRed(int num6) {
        if (num6 >= 620 && num6 <= 750) {
            return true;
        } else {
            return false;
        }
    }

    public String ColorDetector(int a) {
        if (isViolet(a)) {
            return "Color is Violet";
        } else if (isBlue(a)) {
            return "Color is Blue";
        } else if (isGreen(a)) {
            return "Color is Green";
        } else if (isYellow(a)) {
            return "Color is Yellow";
        } else if (isOrange(a)) {
            return "Color is Orange";
        } else if (isRed(a)) {
            return "Color is Red";
        } else
            return "Wrong number!Please input 380-750";
    }
}
