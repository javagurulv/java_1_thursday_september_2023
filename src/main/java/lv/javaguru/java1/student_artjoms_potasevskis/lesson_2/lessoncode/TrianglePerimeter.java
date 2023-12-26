package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

public class TrianglePerimeter {

    double calculateSquere(int a, int b, int c){

        double p = (a+b+c)/2.0;
        double s  = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;

    }


}
