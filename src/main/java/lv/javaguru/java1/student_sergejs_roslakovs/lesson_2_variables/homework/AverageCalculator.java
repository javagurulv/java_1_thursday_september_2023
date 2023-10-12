package lv.javaguru.java1.student_sergejs_roslakovs.lesson_2_variables.homework;

import java.util.Scanner;
public class AverageCalculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three integers:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;
        double average = (double) sum / 3;

        System.out.println("arithmetic average: " + average);
    }
















}
