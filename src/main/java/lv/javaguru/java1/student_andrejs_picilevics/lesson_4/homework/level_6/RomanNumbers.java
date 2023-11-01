package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.level_6;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10: ");
        int romanNumber = scanner.nextInt();

        switch (romanNumber) {
            case 1: {
                System.out.println("I");
                break;
            }
            case 2: {
                System.out.println("II");
            }
            case 3: {
                System.out.println("III");
                break;
            }
            case 4: {
                System.out.println("IV");
                break;
            }
            case 5: {
                System.out.println("V");
                break;
            }
            case 6: {
                System.out.println("VI");
            }
            case 7: {
                System.out.println("VII");
                break;
            }
            case 8: {
                System.out.println("VIII");
                break;
            }
            case 9: {
                System.out.println("IX");
                break;
            }
            case 10: {
                System.out.println("X");
                break;

            }
        }
    }
}

