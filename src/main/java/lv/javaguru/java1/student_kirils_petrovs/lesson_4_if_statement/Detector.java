package lv.javaguru.java1.student_kirils_petrovs.lesson_4_if_statement;

import java.util.Scanner;

public class Detector {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter" );


        int number  = scanner.nextInt();


        boolean NegativeNumber  = number < 0;

        System.out.println("NegativeNumber= "+NegativeNumber );

        boolean isZero = number == 0;

        System.out.println("Zero= "+isZero );


        boolean isPositive = number > 0;

        System.out.println("Positive= "+isPositive );

    }
}
