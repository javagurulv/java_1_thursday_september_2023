package lv.javaguru.java1.student_igor_eglit.lesson_9_project_school_dairy_part_2.lessoncode;

import java.util.List;
import java.util.Scanner;

class StudentUI {

    public static void main(String[] args) {
        StudentBusinessLogic studentBusinessLogic = new StudentBusinessLogic();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Show students");
            System.out.println("3. Add Mark");
            System.out.println("4. Show Marks");
            System.out.println("5. Calculate Average Mark");
            System.out.println("6. Delete student from list");
            System.out.println("7. Delete mark");
            System.out.println("8. Exit");

            System.out.println("Enter menu item to execute: ");
            int menuItem = Integer.parseInt(scanner.nextLine());

            if (menuItem == 1) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                studentBusinessLogic.addStudent(firstName, lastName);
            }
            if (menuItem == 2){
                studentBusinessLogic.showStudents();
            }

            if (menuItem == 3) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                System.out.println("How many marks?");
                int marksQuantity = Integer.parseInt(scanner.nextLine());
                for (int i = 1; i <= marksQuantity; i++) {
                    System.out.println("Enter mark value: ");
                    int markValue = Integer.parseInt(scanner.nextLine());
                    studentBusinessLogic.addMark(firstName, lastName, subject, markValue);
                }
            }

            if (menuItem == 4) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                List<Mark> marks = studentBusinessLogic.getMarks(firstName, lastName, subject);
                if (!marks.isEmpty()) {
                    for (Mark mark : marks) {
                        System.out.print(mark.getMarkValue() + " , ");
                    }
                } else {
                    System.out.println("!!There is no such student, or no marks for this subject!!");
                }
                System.out.println();
            }

            if (menuItem == 5) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                List<Mark> marks = studentBusinessLogic.getMarks(firstName, lastName, subject);
                int sum = 0;
                for (Mark mark : marks) {
                    sum += mark.getMarkValue();
                }
                System.out.println(sum / marks.size());

            }
            if (menuItem == 6) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                studentBusinessLogic.deleteStudentFromList(firstName, lastName);
            }
            if(menuItem == 7){
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                System.out.println("Enter mark value: ");
                int markValue = Integer.parseInt(scanner.nextLine());
                studentBusinessLogic.deleteMarkFromList(firstName, lastName, subject, markValue);
            }

            if (menuItem == 8) {
                System.out.println("Program finish!");
                break;
            }
        }


    }


}
