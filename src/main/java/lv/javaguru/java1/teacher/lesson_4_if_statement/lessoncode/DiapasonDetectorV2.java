package lv.javaguru.java1.teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

class DiapasonDetectorV2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        // [... : -1) OR (1 : ... ]
        if ((number < -1) || (number > 1)) {
            System.out.println("inside diapason!");
        } else {
            System.out.println("outside diapason!");
        }

    }


}
