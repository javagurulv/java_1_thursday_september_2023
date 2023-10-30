package lv.javaguru.java1.student_milans_micko.lesson_4.homework.lvl1;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Even number " + number);
        } else { System.out.println("Not even number " + number); }



    }
}
