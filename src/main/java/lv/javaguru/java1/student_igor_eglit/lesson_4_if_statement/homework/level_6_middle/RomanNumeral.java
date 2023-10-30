package lv.javaguru.java1.student_igor_eglit.lesson_4_if_statement.homework.level_6_middle;

import java.util.Scanner;

class RomanNumeral {
    public static void main(String[] args) {
        System.out.print("Enter number from 1 to 10: ");
        var number = new Scanner(System.in).nextInt();
        String romanNumeral;
        switch (number) {
            case 1:
                romanNumeral = "I";
                break;
            case 2:
                romanNumeral = "II";
                break;
            case 3:
                romanNumeral = "III";
                break;
            case 4:
                romanNumeral = "IV";
                break;
            case 5:
                romanNumeral = "V";
                break;
            case 6:
                romanNumeral = "VI";
                break;
            case 7:
                romanNumeral = "VII";
                break;
            case 8:
                romanNumeral = "VIII";
                break;
            case 9:
                romanNumeral = "IX";
                break;
            case 10:
                romanNumeral = "X";
                break;
            default:
                romanNumeral = "Number must be from 1 to 10!";
        }
        System.out.println("number " + number + " Roman Numeral=  " + romanNumeral);
    }
}
