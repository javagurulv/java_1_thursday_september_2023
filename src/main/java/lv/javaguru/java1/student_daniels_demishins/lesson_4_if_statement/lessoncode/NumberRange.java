package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();

        if((num >= 1) && (num <= 10)){
            System.out.println("Number is inside range (1-10)!");
        } else {
            System.out.println("Number is NOT inside range (1-10)!");
        }
    }
}
