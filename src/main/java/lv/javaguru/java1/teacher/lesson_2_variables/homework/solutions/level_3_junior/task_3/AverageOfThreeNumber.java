package lv.javaguru.java1.teacher.lesson_2_variables.homework.solutions.level_3_junior.task_3;

import java.util.Scanner;

class AverageOfThreeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1 number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter 2 number: ");
        int number2 = scanner.nextInt();
        System.out.println("Please enter 3 number: ");
        int number3 = scanner.nextInt();

        double average = (double) (number1 + number2 + number3) / 3;
        System.out.println("Average = " + average);
    }

}
