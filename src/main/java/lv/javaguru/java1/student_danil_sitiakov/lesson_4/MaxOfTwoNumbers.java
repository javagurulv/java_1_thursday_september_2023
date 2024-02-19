package lv.javaguru.java1.student_danil_sitiakov.lesson_4;

import java.util.Scanner;

class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA > numB) {
            System.out.println(numA + " is bigger than " + numB);
        } else if (numB > numA) {
            System.out.println(numB + " is bigger than " + numA);
        } else {
            System.out.println("Incorrect. Numbers are equals");
        }
    }
}
