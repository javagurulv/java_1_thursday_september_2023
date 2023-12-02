package lv.javaguru.java1.student_viktors_aleksejevs.lesson_2_variables.homework;

import lv.javaguru.java1.teacher.lesson_8_project_school_dairy_part_1.lessoncode.tasks.MarkBusinessLogic;

import java.util.Scanner;

public class MarkUI {

    public static void main(String[] args) {
        MarkBusinessLogic businessLogic = new MarkBusinessLogic();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add mark");
            System.out.println("2. Find max mark");
            System.out.println("3. Find min mark");
            System.out.println("4. Find average mark");
            System.out.println("5. Exit");

            System.out.println("Enter menu item to execute: ");
            int menuItem = Integer.parseInt(scanner.nextLine());

            if (menuItem == 1) {
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                System.out.println("Enter mark value: ");
                int markValue = Integer.parseInt(scanner.nextLine());
                businessLogic.addMark(subject, markValue);
            }

            if (menuItem == 2) {
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                int maxMark = businessLogic.findMaxMark(subject);
                System.out.println("Max mark = " + maxMark);
            }

            if (menuItem == 3) {
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                int minMark = businessLogic.findMinMark(subject);
                System.out.println("Min mark = " + minMark);


            }
            if (menuItem == 4) {
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
               // int averageMark = businessLogic.findAverageMark(subject);
              //  System.out.println("Average mark = " + averageMark);
            }

            if (menuItem == 5) {
                System.out.println("Program finish!");
                break;
            }
        }


    }


}
