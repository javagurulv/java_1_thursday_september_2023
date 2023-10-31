package lv.javaguru.java1.student_andrejs_picilevics.lesson_4.homework.level_6;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7 ");
        int dayOfTheWeek = scanner.nextInt();
        switch (dayOfTheWeek){
            case 1:{
                System.out.println("Monday");
                break;
            } case 2:{
                System.out.println("Tuesday");
                break;
            } case 3:{
                System.out.println("Wednesday");
                break;
            } case 4:{
                System.out.println("Thursday");
                break;
            } case 5:{
                System.out.println("Friday");
                break;
            } case 6:{
                System.out.println("Saturday");
                break;
            } case 7:{
                System.out.println("Sunday");
            }
        }
    }
}
