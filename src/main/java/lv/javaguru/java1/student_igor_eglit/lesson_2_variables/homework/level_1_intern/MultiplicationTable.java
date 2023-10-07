package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.homework.level_1_intern;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
        System.out.println("Input number");
      int number = in.nextInt();
      //nextInt(): считывает введенное число int
        //int result1 = number;
        int result2 = number * 2;
        int result3 = number * 3;
        int result4 = number * 4;
        int result5 = number * 5;
        int result6 = number * 6;
        int result7 = number * 7;
        int result8 = number * 8;
        int result9 = number * 9;
        System.out.println(number + " x 1 = " + number);
        System.out.println(number + " x 2 = " + result2);
        System.out.println(number + " x 3 = " + result3);
        System.out.println(number + " x 4 = " + result4);
        System.out.println(number + " x 5 = " + result5);
        System.out.println(number + " x 6 = " + result6);
        System.out.println(number + " x 7 = " + result7);
        System.out.println(number + " x 8 = " + result8);
        System.out.println(number + " x 9 = " + result9);





    }
}
