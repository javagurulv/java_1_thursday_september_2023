package lv.javaguru.java1.student_valera_kovs.lesson_1_introduction.homework;

import java.util.Scanner;

class TaskHello {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input your name : ");
            String name = scanner.nextLine();

            System.out.println("Your name is " + name);
        }
    }
