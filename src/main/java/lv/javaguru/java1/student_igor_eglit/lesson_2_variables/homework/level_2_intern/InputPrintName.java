package lv.javaguru.java1.student_igor_eglit.lesson_2_variables.homework.level_2_intern;
import java.util.Scanner;
public class InputPrintName {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        //nextLine(): считывает всю введенную строку
        System.out.println("Hello " + name + " !");
    }
}
