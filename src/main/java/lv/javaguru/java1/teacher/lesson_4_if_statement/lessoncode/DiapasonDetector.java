package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

class DiapasonDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        // [1 : 10]
        if ((number >= 1) && (number <= 10)) {
            System.out.println("inside diapason!");
        } else {
            System.out.println("outside diapason!");
        }

    }


}
