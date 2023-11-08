package lv.javaguru.java1.student_kirils_petrovs.lesson_5_methods.homework.level_1_intern.task_2;

import java.util.Scanner;

class Color {
    public void determineColor(int input) {
        int Violet = 380;
        int Violet2 = 449;



        int Blue = 450;
        int Blue2 = 494;



        int Green = 495;
        int Green2 = 569;



        int Yellow = 570;
        int Yellow2 = 589;



        int Orange = 590;
        int Orange2 = 619;



        int Red = 620;
        int Red2 = 750;

        if (Violet <= input && input <= Violet2) {
            System.out.println("Violet");
        }



        else if (Blue <= input && input <= Blue2) {
            System.out.println("Blue");
        }



        else if (Green <= input && input <= Green2) {
            System.out.println("Green");
        }



        else if (Yellow <= input && input <= Yellow2) {
            System.out.println("Yellow");
        }



        else if (Orange <= input && input <= Orange2) {
            System.out.println("Orange");
        }


        else if (Red <= input && input <= Red2) {
            System.out.println("Red");
        }


        else {
            System.out.println("Invisible Light");
        }
    }
}