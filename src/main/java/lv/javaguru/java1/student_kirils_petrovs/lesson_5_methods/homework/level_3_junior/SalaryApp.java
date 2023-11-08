package lv.javaguru.java1.student_kirils_petrovs.lesson_5_methods.homework.level_3_junior;

import java.util.Scanner;

public class SalaryApp {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Your number: ");


        int input = scanner.nextInt();


        Salary salary = new Salary();
        salary.Money(input);






    }



}
