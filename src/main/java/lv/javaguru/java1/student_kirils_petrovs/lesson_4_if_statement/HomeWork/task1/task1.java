package lv.javaguru.java1.student_kirils_petrovs.lesson_4_if_statement.HomeWork.task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner Scaner = new Scanner(System.in);
        int number1 = Scaner.nextInt();

        if (number1 == 1)
        {

            System.out.println("понедельник");

        } else { if (number1 == 2)
        System.out.println("Вторник"); }

        if (number1 == 3)
        System.out.println("Среда");

        if (number1 == 4)
            System.out.println("Четверг");


        if (number1 == 5)
            System.out.println("пятница");


        if (number1 == 6)
            System.out.println("Суббота");


        if (number1 == 7)
            System.out.println("Воскресенье");


    }

}