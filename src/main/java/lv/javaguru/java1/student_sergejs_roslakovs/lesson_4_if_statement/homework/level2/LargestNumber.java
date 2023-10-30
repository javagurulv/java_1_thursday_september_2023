package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.homework.level2;

import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int largest;

        if (num1 > num2) {
            largest = num1;
        } else {
            largest = num2;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}







