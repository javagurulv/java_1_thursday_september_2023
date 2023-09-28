package lv.javaguru.java1.teacher.lesson_2_variables.homework.solutions.level_3_junior.task_1;

import java.util.Scanner;

class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();

        // simple variant
        System.out.println(number + " * 1 = " + number * 1);
        System.out.println(number + " * 2 = " + number * 2);
        System.out.println(number + " * 3 = " + number * 3);
        System.out.println(number + " * 4 = " + number * 4);
        System.out.println(number + " * 5 = " + number * 5);
        System.out.println(number + " * 6 = " + number * 6);
        System.out.println(number + " * 7 = " + number * 7);
        System.out.println(number + " * 8 = " + number * 8);
        System.out.println(number + " * 9 = " + number * 9);
        System.out.println(number + " * 10 = " + number * 10);

        System.out.println("----------------------------");

        // variant with circle for
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }

    }

}
