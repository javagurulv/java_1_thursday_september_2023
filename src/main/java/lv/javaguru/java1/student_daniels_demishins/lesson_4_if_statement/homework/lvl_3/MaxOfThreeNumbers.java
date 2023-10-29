package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.homework.lvl_3;

import java.util.Scanner;

class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();

        if (numA > numB && numA > numC) {
            System.out.println("Bigger " + numA);
        } else if (numB > numA && numB > numC) {
            System.out.println("Bigger " + numB);
        } else if (numC > numB && numC > numA) {
            System.out.println("Bigger " + numC);
        } else if (numA == numB && numB == numC) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Impossible fo find max numbers");
        }
    }
}
