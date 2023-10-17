package lv.javaguru.java1.teacher.lesson_4_if_statement.homework.solutions.level_6_middle.task_1;

import java.util.Scanner;

class SeasonOfTheYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 3: case 4: case 5: {
                System.out.println("Spring");
                break;
            }
            case 6: case 7: case 8: {
                System.out.println("Summer");
                break;
            }
            case 9: case 10: case 11: {
                System.out.println("Autumn");
                break;
            }
            case 12: case 1: case 2: {
                System.out.println("Winter");
                break;
            }
        }
    }

}
