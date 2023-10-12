package lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_3;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scanner.nextInt();

        int result2 = num*2;
        int result3 = num*3;
        int result4 = num*4;
        int result5 = num*5;
        int result6 = num*6;
        int result7 = num*7;
        int result8 = num*8;
        int result9 = num*9;
        int result10 = num*10;

        System.out.println(num + " * 1 = "+ num);
        System.out.println(num + " * 2 = "+result2);
        System.out.println(num + " * 3 = "+result3);
        System.out.println(num + " * 4 = "+result4);
        System.out.println(num + " * 5 = "+result5);
        System.out.println(num + " * 6 = "+result6);
        System.out.println(num + " * 7 = "+result7);
        System.out.println(num + " * 8 = "+result8);
        System.out.println(num + " * 9 = "+result9);
        System.out.println(num + " * 10 = "+result10);
    }
}
