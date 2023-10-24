package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your weight in kilograms:  ");
        int weight = in.nextInt();
        System.out.print("Your height in meters:  ");
        double height = in.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("Your BMI is " + bmi);


    }
}