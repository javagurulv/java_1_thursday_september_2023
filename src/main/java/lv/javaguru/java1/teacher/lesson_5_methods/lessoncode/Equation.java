package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class Equation {

    double calculateD(int a, int b, int c) {
        return (double) b * b - 4 * a * c;
    }

    double findX(int a, int b, int c) {
        return (double)(-1 * b) / (2 * a);
    }

    double findX1(int a, int b, int c) {
        return (double)(-1 * b) + Math.sqrt(calculateD(a,b,c)) / (2 * a);
    }

    double findX2(int a, int b, int c) {
        return (double)(-1 * b) - Math.sqrt(calculateD(a,b,c)) / (2 * a);
    }


}
