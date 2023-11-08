package lv.javaguru.java1.student_valera_kovs.lesson5.homework.lvl1;

public class Honework2 {

    public String color(int number) {


        if (number > 380 && number <= 449) {
            return "color is Violet";

        } else if (number > 450 && number <= 494) {
            return "color is Blue";

        } else if (number > 495 && number <= 569) {
            return "color is Green";

        } else if (number > 570 && number <= 589) {
            return "color is Yellow";

        } else if (number > 590 && number <= 619) {
            return "color is Orange";

        } else if (number > 620 && number <= 750) {
            return "color is Red";

        } else {
            return ("Invisible Light");

        }
    }
}

