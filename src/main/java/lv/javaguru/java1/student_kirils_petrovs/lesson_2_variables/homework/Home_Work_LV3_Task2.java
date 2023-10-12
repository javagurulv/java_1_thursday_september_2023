package lv.javaguru.java1.student_kirils_petrovs.lesson_2_variables.homework;


import java.util.Scanner;

public class Home_Work_LV3_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ваш радиус: ");

        double radius1 =  7.5;

        double perimeter = 2 * Math.PI * radius1;
        double area = Math.PI * radius1 * radius1;

        System.out.println("Perimeter is = " + String.format("%.14f", perimeter));
        System.out.println("Area is = " + String.format("%.14f", area));
    }
}