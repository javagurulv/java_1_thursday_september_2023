package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class DiapasonDetector {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();


    //[1 : 10]
    if ((number >= 1) && (number <= 10)) {
        System.out.println("inside diapason!");
    } else {
        System.out.println("outside diapason!");
    }

    }
}
