package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class BigOfTwoNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Number 1 is bigger");
        } else {
            System.out.println("Number 2 is bigger");
        }

    }
}
