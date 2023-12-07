package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        boolean isPositive = number > 0;
        if (isPositive) {
            System.out.println("Number is postive!");
        }

        if (number > 0) {
            System.out.println("Number is positive!");
        }

    double PolicyPrice = 222.365;
   if (PolicyPrice < 50) {
       PolicyPrice = 50;
       System.out.println("Number is positive!");
   }

   boolean lessThenMinimalPremium = PolicyPrice < 50;
   if (lessThenMinimalPremium) {
       PolicyPrice = 50;
   }



    }
}
