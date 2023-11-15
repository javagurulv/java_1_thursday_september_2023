package lv.javaguru.java1.student_milans_micko.lesson_5_methods.lessoncode;

class Calculator {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }

    }
    double findAverage(int number1, int number2) {
        double average = (number1 + number2) / 2.0;
        return average;
    }

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
