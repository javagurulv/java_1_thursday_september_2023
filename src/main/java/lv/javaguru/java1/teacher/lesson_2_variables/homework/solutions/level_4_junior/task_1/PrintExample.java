package lv.javaguru.java1.teacher.lesson_2_variables.homework.solutions.level_4_junior.task_1;

import java.util.Scanner;

class PrintExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter user name: ");
        String userName = scanner.nextLine();
        System.out.print("Hello ");
        System.out.print(userName);
    }

}
