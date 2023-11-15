package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl3;

class SquareEquation {

    //testcase discriminant: a = 1, b = 5, c = 6; expected result: 1
    //testcase square root: a = 1, b = 5, c = 6; expected result: true
    //testcase first root: a = 1, b = 5, c = 6; expected result: -3
    //testcase second root: a = 1, b = 5, c = 6; expected result: -2


    public double discriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }

    public boolean isSquareRoot(int a, int b, int c) {
        return discriminant(a, b, c) >= 0;
    }

    public double firstRoot(int a, int b, int c) {
        double D = discriminant(a, b, c);
        return (-b - Math.sqrt(D)) / (2 * a);
    }

    public double secondRoot(int a, int b, int c) {
        double D = discriminant(a, b, c);
        return (-b + Math.sqrt(D)) / (2 * a);
    }

}
