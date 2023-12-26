package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.homework_level3;

import java.util.Scanner;

public class AverageOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        System.out.println("Average of three numbers is " +(number1+number2+number3) /3);

    }


}
