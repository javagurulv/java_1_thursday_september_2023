package lv.javaguru.java1.student_sergejs_roslakovs.lesson_5_methods.homework.level3;

import java.util.Scanner;

class ProgressiveTaxApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        while (true) {
            System.out.println("Enter the money(or Zero to exit program): ");
            double money = scanner.nextDouble();
            String tax = ProgressiveTax.getTax(money);
            System.out.println(" Tax: " + tax);
            if (money == 0) {
                break;
            }
        }
    }
}









