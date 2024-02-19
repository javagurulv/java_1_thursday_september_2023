package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.homework;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();

        System.out.println("Average of three numbers is " +(numA+numB+numC) /3);

    }
}
