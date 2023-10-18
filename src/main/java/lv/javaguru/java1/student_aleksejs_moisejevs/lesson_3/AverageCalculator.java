package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_3;


import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter 1 number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter 2 number: ");
        int number2 = scanner.nextInt();

        System.out.print("Please enter 3 number: ");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;
        double average = (double) sum / 3;

        System.out.println("Average =  " + average);

        scanner.close();
    }
}
