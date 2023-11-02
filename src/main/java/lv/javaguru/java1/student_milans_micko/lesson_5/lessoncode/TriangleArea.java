package lv.javaguru.java1.student_milans_micko.lesson_5.lessoncode;

class TriangleArea {

    double calculateSquare(int a, int b, int c) {
        double p =(a+b+c)/2.0;
        double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
        return s;
    }



}
