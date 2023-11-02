package lv.javaguru.java1.teacher.lesson_5_methods.lessoncode;

class Equation {

    // a, b, c - int (double) - get from user using Scanner

// 1. calculate D - (formula) - calculateD(...)
// 2. if (D < 0) - kornei net!!!!  (print "kornei net!!!!")
// 3. if (D = 0) - odin korenj (formula)!! (findX())  (print(x) )
// 4. if (D > 0) - dva kornja (formula)!! findX1(), findX2() (print(x1), print(x2))

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
