package lv.javaguru.java1.student_artjoms_potasevskis.lesson_4_homework.level_1;

import java.util.Scanner;

class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Number is even!");
        } else {
            System.out.println("Number is odd!");
        }
    }



}
