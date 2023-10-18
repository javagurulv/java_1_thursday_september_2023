package lv.javaguru.java1.student_andrejs_picilevics.lesson_2.homework.level_3;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {

        System.out.println("Please enter an number");
        Scanner scanner = new Scanner(System.in);
        int myNumber = scanner.nextInt();
        int result1 = myNumber * 1;
        int result2 = myNumber * 2;
        int result3 = myNumber * 3;
        int result4 = myNumber * 4;
        int result5 = myNumber * 5;
        int result6 = myNumber * 6;
        int result7 = myNumber * 7;
        int result8 = myNumber * 8;
        int result9 = myNumber * 9;
        int result10 = myNumber * 10;

        System.out.println(myNumber + " x 1 = " + result1);
        System.out.println(myNumber + " x 2 = " + result2);
        System.out.println(myNumber + " x 3 = " + result3);
        System.out.println(myNumber + " x 4 = " + result4);
        System.out.println(myNumber + " x 5 = " + result5);
        System.out.println(myNumber + " x 6 = " + result6);
        System.out.println(myNumber + " x 7 = " + result7);
        System.out.println(myNumber + " x 8 = " + result8);
        System.out.println(myNumber + " x 9 = " + result9);
        System.out.println(myNumber + " x 10 = " + result10);
    }
}
