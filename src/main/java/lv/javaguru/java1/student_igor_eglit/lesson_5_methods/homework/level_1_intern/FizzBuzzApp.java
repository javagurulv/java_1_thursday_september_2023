package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_1_intern;

import java.util.Scanner;

public class FizzBuzzApp {
    public static void main(String[] args) {
        FizzBuzz fizzBuzzApplication = new FizzBuzz();
        while (true) {
            System.out.print("Enter number: ");
            int number = new Scanner(System.in).nextInt();
            System.out.println(fizzBuzzApplication.fizzBuzz(number));
            if (number==0) {
            break;
            }
        }
    }
}
/*
class FizzBuzzDemo {

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println("Number 5 = " + fizzBuzz.detect(5));
        System.out.println("Number 6 = " + fizzBuzz.detect(6));
        System.out.println("Number 10 = " + fizzBuzz.detect(10));
        System.out.println("Number 15 = " + fizzBuzz.detect(15));
    }

}
 */