package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.lessoncode.Lesson4;

import java.util.Scanner;

public class NegativeNumberDetector {
    public static void main(String[] args) {
        var number = new Scanner(System.in).nextInt();
        boolean isNegativeNumber = number<0;
        System.out.println("Number is negative= " + isNegativeNumber);
    }
}
