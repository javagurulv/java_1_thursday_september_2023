package lv.javaguru.java1.student_jelena_vavere.lesson_2_variables.homework;

import java.util.Scanner;

public class HomeWorkCalculator {
    public static void main(String[] args) {
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Введите целое число");
            int number = scanner.nextInt();
            for (int i = 1; i <= 10; i++){
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }
            scanner.close();
        }
    }

