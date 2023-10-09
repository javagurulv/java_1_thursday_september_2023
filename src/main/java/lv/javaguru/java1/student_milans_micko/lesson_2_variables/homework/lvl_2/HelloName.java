package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lvl_2;

import java.util.Scanner;
public class HelloName {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();

        System.out.println("Name: "+name);

    }
}
