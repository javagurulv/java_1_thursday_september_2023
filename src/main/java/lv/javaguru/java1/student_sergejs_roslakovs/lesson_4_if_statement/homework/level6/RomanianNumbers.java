package lv.javaguru.java1.student_sergejs_roslakovs.lesson_4_if_statement.homework.level6;

import java.util.Scanner;

class RomanianNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-10): ");
        int number = scanner.nextInt();

        String romanianNumber;

        switch (number) {
            case 1:
                romanianNumber = "I";
                break;
            case 2:
                romanianNumber = "II";
                break;
            case 3:
                romanianNumber = "III";
                break;
            case 4:
                romanianNumber = "IV";
                break;
            case 5:
                romanianNumber = "V";
                break;
            case 6:
                romanianNumber = "VI";
                break;
            case 7:
                romanianNumber = "VII";
                break;
            case 8:
                romanianNumber = "VIII";
                break;
            case 9:
                romanianNumber = "IX";
                break;
            case 10:
                romanianNumber = "X";
                break;
            default:
                romanianNumber = "Invalid number";
                break;
        }

        System.out.println("Romanian number is: " + romanianNumber);

        scanner.close();
    }
}








