package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NegativeNumberDetector {
    public static void main(String[] args) {
        var number = new Scanner(System.in).nextInt();
        boolean isNegativeNumber = number<0;
        System.out.println("Number is negative= " + isNegativeNumber);
    }
}
