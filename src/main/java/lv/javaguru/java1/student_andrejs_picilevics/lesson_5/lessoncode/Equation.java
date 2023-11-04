package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.lessoncode;

class Equation {
    double calculateD(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    double findX(int a, int b, int c) {
        return (-1 * b) / (2 * a);
    }

    double findX1(int a, int b, int c) {
        return (-1 * b) + Math.sqrt(calculateD(a, b, c)) / (2 * a);
    }

    double findX2(int a, int b, int c) {
        return (-1 * b) - Math.sqrt(calculateD(a, b, c)) / (2 * a);
    }
}
