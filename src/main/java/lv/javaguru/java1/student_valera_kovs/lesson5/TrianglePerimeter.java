package lv.javaguru.java1.student_valera_kovs.lesson5;

public class TrianglePerimeter {

    double calculateSquare(int a, int b, int c) {
        double p = (a+b+c)/2.0;
        double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
        return s;
    }

    double calculateSquareV2(int a, int b, int c) {
        double p = (a+b+c)/2.0;
        return Math.sqrt(p * (p-a)*(p-b)*(p-c));
    }
}
