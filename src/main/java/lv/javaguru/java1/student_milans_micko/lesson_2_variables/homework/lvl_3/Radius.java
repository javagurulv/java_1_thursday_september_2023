package lv.javaguru.java1.student_milans_micko.lesson_2_variables.homework.lvl_3;

import lv.javaguru.java1.student_daniels_demishins.lesson_2_variables.homework.lvl_4.SystemOutPrint;

import java.util.Scanner;

public class Radius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("area is: " + area);
        double circumference = Math.PI * 2*radius;
        System.out.println("perimeter: " + circumference);

    }


}
