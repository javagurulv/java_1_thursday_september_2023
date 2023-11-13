package lv.javaguru.java1.student_milans_micko.lesson_6.homework.lvl3;

class SquareEquation {

    //testcase1: a = 4, b = -5, c = 2; expected result:
    //testcase2: a = 4, b = -5, c = 2; expected result:
    //testcase3: a = 4, b = -5, c = 2; expected result:
    //testcase4: a = 4, b = -5, c = 2; expected result:

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
