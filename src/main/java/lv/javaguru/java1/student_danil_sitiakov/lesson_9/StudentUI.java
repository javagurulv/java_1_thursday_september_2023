package lv.javaguru.java1.student_danil_sitiakov.lesson_9;


import java.util.List;
import java.util.Scanner;

class StudentUI {

    public static void main(String[] args) {
        StudentBusinessLogic businessLogic = new StudentBusinessLogic();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Mark");
            System.out.println("3. Show Marks");
            System.out.println("4. Calculate Average Mark");
            System.out.println("5. Exit");

            System.out.println("Enter menu item to execute: ");
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
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                System.out.println("Enter mark value: ");
                int markValue = Integer.parseInt(scanner.nextLine());
                businessLogic.addMark(firstName, lastName, subject, markValue);
            }

            if (menuItem == 3) {
                System.out.println("Enter student first name: ");
                String firstName = scanner.nextLine();
                System.out.println("Enter student last name: ");
                String lastName = scanner.nextLine();
                System.out.println("Enter subject: ");
                String subject = scanner.nextLine();
                List<Mark> marks = businessLogic.getMarks(firstName, lastName, subject);
                for (Mark mark : marks) {
                    System.out.print(mark.getmarkValue() + " , ");
                }
            }

            if (menuItem == 4) {

            }

            if (menuItem == 5) {
                System.out.println("Program finish!");
                break;
            }
        }


    }

}
