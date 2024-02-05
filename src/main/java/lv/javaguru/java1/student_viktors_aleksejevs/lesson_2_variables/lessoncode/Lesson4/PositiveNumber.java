package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson4;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        var a = new Scanner(System.in).nextInt();
        if (a>=0){
            System.out.println("Number is positive");
        }
        boolean isPositive = a>0;
        if(isPositive){
            System.out.println("Positive number");
        }

    }
}
