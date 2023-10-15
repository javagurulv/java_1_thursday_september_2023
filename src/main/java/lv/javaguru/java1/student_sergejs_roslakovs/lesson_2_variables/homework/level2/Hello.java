package lv.javaguru.java1.student_sergejs_roslakovs.lesson_2_variables.homework.level2;

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        System.out.println("Hello " + Name);


    }
}
