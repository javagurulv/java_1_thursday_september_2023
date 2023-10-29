package lv.javaguru.java1.student_daniels_demishins.lesson_4_if_statement.homework.lvl_2;

import java.util.Scanner;

class NumbersAreEquals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        if (numA != numB) {
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equals");
        }
    }
}