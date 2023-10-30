package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println("Number is positive!");
        }


    }




}
