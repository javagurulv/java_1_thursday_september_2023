package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.level_3_junior;

class SquareEquation {

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
