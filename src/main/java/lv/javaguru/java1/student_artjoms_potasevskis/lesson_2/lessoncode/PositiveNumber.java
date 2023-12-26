package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

import java.util.Scanner;

public class PositiveNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        if ((number >= 1) && (number <= 10)) {

            System.out.println("inside diaposon!");
        } else {
            System.out.println("outside diaposon!");
        }

    }
}