package lv.javaguru.java1.teacher.lesson_2_variables.lessoncode;

import java.util.Scanner;

public class TriangleSquare {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        int aSide = in.nextInt();

        System.out.print("Input b: ");
        int bSide = in.nextInt();

        System.out.print("Input c: ");
        int cSide = in.nextInt();

        System.out.println("A side = " + aSide);
        System.out.println("B side = " + bSide);
        System.out.println("C side = " + cSide);

        double p = (aSide + bSide + cSide) / 2;
        double square = Math.sqrt(p * (p - aSide) * (p - bSide) * (p - cSide));

        System.out.println("Triangle square = " + square);
    }

}
