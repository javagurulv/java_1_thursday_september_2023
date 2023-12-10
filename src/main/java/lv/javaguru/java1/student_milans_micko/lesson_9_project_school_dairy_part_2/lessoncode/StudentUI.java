package lv.javaguru.java1.student_milans_micko.lesson_9_project_school_dairy_part_2.lessoncode;

import lv.javaguru.java1.teacher.lesson_9_project_school_dairy_part_2.lessoncode.tasks.Mark;

import java.util.List;
import java.util.Scanner;

class StudentUI {

    public static void main(String[] args) {
        StudentBusinessLogic studentBusinessLogic = new StudentBusinessLogic();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Mark");
            System.out.println("3. Show Students");
            System.out.println("4. Show Marks");
            System.out.println("5. Calculate Average Mark");
            System.out.println("6. Calculate Max Mark");
            System.out.println("7. Calculate Min Mark");
            System.out.println("8. Exit");

            System.out.println("Enter menu item to execute: ");
            int menuItem = Integer.parseInt(scanner.nextLine());
            //ADD STUDENT
            if (menuItem == 1) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                studentBusinessLogic.addStudent(firstName, lastName);
            }
            //ADD MARKS
            if (menuItem == 2) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                System.out.println("Enter mark value: ");
                int markValue = Integer.parseInt(scanner.nextLine());
                studentBusinessLogic.addMark(firstName, lastName, subject, markValue);
            }
            //SHOW STUDENTS
            if (menuItem == 3) {
                studentBusinessLogic.showStudents();
            }

            //SHOW MARKS
            if (menuItem == 4) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                List<Mark> marks = studentBusinessLogic.getMarks(firstName, lastName, subject);
                for (Mark mark : marks) {
                    System.out.println(" , " + mark.getMarkValue());
                }
            }

            //Calculate Average Mark
            if (menuItem == 5) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                studentBusinessLogic.calculateAverageMark(firstName, lastName, subject);
            }

            //Calculate Max Mark
            if (menuItem == 6) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                int maxMark = studentBusinessLogic.calculateMaxMark(firstName, lastName, subject);
                System.out.println("Max mark = " + maxMark);
            }

            //Calculate Min Mark
            if (menuItem == 7) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                int minMark = studentBusinessLogic.calculateMinMark(firstName, lastName, subject);
                System.out.println("Min mark = " + minMark);
            }

            if (menuItem == 8) {
                System.out.println("Program finish!");
                break;
            }


        }


    }
}