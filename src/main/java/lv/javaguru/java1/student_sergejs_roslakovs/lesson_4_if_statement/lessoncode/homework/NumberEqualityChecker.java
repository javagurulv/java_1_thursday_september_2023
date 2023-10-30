package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.lessoncode.homework;

import java.util.Scanner;

class NumberEqualityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        if (num1 != num2) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equal");
        }

        scanner.close();
    }






}
