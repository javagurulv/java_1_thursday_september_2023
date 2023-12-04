package lv.javaguru.java1.student_valera_kovs.lesson9;

import java.util.List;
import java.util.Scanner;

public class StudentUI {

    public static void main(String[] args) {
       StudentBusinessLogic businessLogic = new StudentBusinessLogic();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Mark");
            System.out.println("3. findStudent");
            System.out.println("4. collectStudentMarksBySubject");
            System.out.println("5. Exit");

            System.out.println("Enter execute:");
            int menuItem = Integer.parseInt(scanner.nextLine());

            if (menuItem == 1) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                businessLogic.addStudent(firstName, lastName);
            }

            if (menuItem == 2) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter: ");
                String subject = scanner.nextLine();
                System.out.println("Enter value: ");
                int markValue = Integer.parseInt(scanner.nextLine());
                businessLogic.addMark(firstName, lastName, subject, markValue);
            }

            if (menuItem == 3) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter: ");
                String subject = scanner.nextLine();
                List<Mark> marks = businessLogic.getMark(firstName, lastName, subject);
                for (Mark mark : marks) {
                    System.out.print(mark.getMarkValue() + " , ");
                }
            }

            if (menuItem == 4) {

            }

            if (menuItem == 5) {
                System.out.println("finish!");
                break;
            }
        }


    }


}
