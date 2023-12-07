package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

public class TrianglePerimeter {

    double calculateSquare(int a, int b, int c){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
        return s;

    }
}
