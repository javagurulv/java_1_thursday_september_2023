package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level1;

import java.util.Scanner;

class FizzBuzzApp {

    public static void main(String[] args) {

        FizzBuzz fizzbuzz = new FizzBuzz();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter integer number (or Zero to exit program): ");
            int number = scanner.nextInt();
            if (number == 0) break;
            fizzbuzz.convert(number);
        }

    }

}






