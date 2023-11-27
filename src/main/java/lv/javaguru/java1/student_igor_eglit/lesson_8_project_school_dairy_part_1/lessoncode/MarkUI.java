package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.lessoncode;


import java.util.Scanner;

public class MarkUI {

    public static void main(String[] args) {

        mainMenu();

    }

    private static void mainMenu() {
        MarkBusinessLogic businessLogic = new MarkBusinessLogic();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add mark");
            System.out.println("2. Find max mark");
            System.out.println("3. Find min mark");
            System.out.println("4. Find average subject mark");
            System.out.println("5. Find average mark");
            System.out.println("6. Exit");

            System.out.println("Enter menu item to execute: ");
            int mainMenuItem = Integer.parseInt(scanner.nextLine());

            addMark(mainMenuItem, scanner, businessLogic);

            findMaxMark(mainMenuItem, scanner, businessLogic);

            findMinMark(mainMenuItem, scanner, businessLogic);

            findAverageSubjectMark(mainMenuItem, scanner, businessLogic);

            findAverageMark(mainMenuItem, businessLogic);

            if (finishProgram(mainMenuItem)) break;
        }
    }


    private static void addMark(int mainMenuItem, Scanner scanner, MarkBusinessLogic businessLogic) {
        String subject;
        if (mainMenuItem == 1) {
            while (true) {
                subject = chooseSubjectMenu(scanner);
                System.out.println("Enter mark value: ");
                int markValue = Integer.parseInt(scanner.nextLine());
                businessLogic.addMark(subject, markValue);
            }
        }
    }


    private static void findMaxMark(int mainMenuItem, Scanner scanner, MarkBusinessLogic businessLogic) {
        String subject;
        if (mainMenuItem == 2) {
            subject = chooseSubjectMenu(scanner);
            int maxMark = businessLogic.findMaxMark(subject);
            System.out.println("Max " + subject + " mark = " + maxMark + '\n');
        }
    }

    private static void findMinMark(int mainMenuItem, Scanner scanner, MarkBusinessLogic businessLogic) {
        String subject;
        if (mainMenuItem == 3) {
            subject = chooseSubjectMenu(scanner);
            int minMark = businessLogic.findMinMark(subject);
            System.out.println("Min " + subject + " mark = " + minMark + '\n');
        }
    }

    private static void findAverageSubjectMark(int mainMenuItem, Scanner scanner, MarkBusinessLogic businessLogic) {
        String subject;
        if (mainMenuItem == 4) {
            subject = chooseSubjectMenu(scanner);
            float averageSubjectMark = businessLogic.findMinMark(subject);
            System.out.println("Average " + subject + " mark = " + averageSubjectMark + '\n');
        }
    }

    private static void findAverageMark(int mainMenuItem, MarkBusinessLogic businessLogic) {
        if (mainMenuItem == 5) {
            float averageMark = businessLogic.findAverageMark();
            System.out.println("Average tabel mark = " + averageMark);
        }
    }

    private static boolean finishProgram(int mainMenuItem) {
        if (mainMenuItem == 6) {
            System.out.println("Program finish!");
            return true;
        }
        return false;
    }

    private static String chooseSubjectMenu(Scanner scanner) {
        System.out.println("Select the subject: ");
        System.out.println("1. Math");
        System.out.println("2. Eng");
        System.out.println("3. Lat");
        System.out.println("4. Return to Main Menu");
        String subject = scanner.nextLine();
        switch (subject) {
            case "1" -> subject = "Math";
            case "2" -> subject = "Eng";
            case "3" -> subject = "Lat";
            case "4" -> mainMenu();
            default -> {
                System.out.println("Use number from 1 to 4");
                subject = chooseSubjectMenu(scanner);
            }
        }
        return subject;
    }
}

