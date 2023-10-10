package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.lessoncode;


import java.util.Scanner;
public class Seconds {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds value:  ");
        int sec = in.nextInt();
        int hour = (sec/3600);
        int min = (sec-(hour*3600))/60;
        int secPrint = (sec - (hour*3600) - min*60);
        System.out.println();
        System.out.print(hour + ":" + min + ":" + secPrint);

    }
}
