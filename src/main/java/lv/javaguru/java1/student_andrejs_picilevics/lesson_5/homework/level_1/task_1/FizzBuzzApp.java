package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_1.task_1;

import java.util.Scanner;

class FizzBuzzApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.dividedBy3And5(num);
        System.out.println(result);

    }
}
