package lv.javaguru.java1.student_kirils_petrovs.lesson_2_variables.homework.Home_Work_LV_3_Task;





//Напишите программу, которая запрашивает у пользователя целое число
//и печатает на консоль таблицу умножения.
//
//Test Data:
//Input a number: 8
//
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80


import java.util.Scanner;

public class Home_Work_LV3_Task1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите ваше число:");

        int z = scanner.nextInt();

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int h = 7;
        int i = 8;
        int j = 9;
        int k = 10;

        int product1 = z * a;
        int product2 = z * b;
        int product3 = z * c;
        int product4 = z * d;
        int product5 = z * e;
        int product6 = z * f;
        int product7 = z * h;
        int product8 = z * i;
        int product9 = z * j;
        int product10 = z * k;


        System.out.println("1*" + z + "=" + product1);
        System.out.println("2*" + z + "=" + product2);
        System.out.println("3*" + z + "=" + product3);
        System.out.println("4*" + z + "=" + product4);
        System.out.println("5*" + z + "=" + product5);
        System.out.println("6*" + z + "=" + product6);
        System.out.println("7*" + z + "=" + product7);
        System.out.println("8*" + z + "=" + product8);
        System.out.println("9*" + z + "=" + product9);
        System.out.println("10*" + z + "=" + product10);

    }
}
