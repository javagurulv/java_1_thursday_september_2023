package lv.javaguru.java1.student_jelena_vavere.lesson_2_variables.homework;

import java.util.Scanner;

    public class AverageOfThreeNumbers {
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Entre number 1 : ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter number 2 : ");
            double number2 = scanner.nextDouble();

            System.out.println("Enter number 3 : ");
            double number3 = scanner.nextDouble();

            double average = (number1 + number2 + number3) / 3;
            System.out.println("The average of three number is : " + average);

            scanner.close();


        }
    }


