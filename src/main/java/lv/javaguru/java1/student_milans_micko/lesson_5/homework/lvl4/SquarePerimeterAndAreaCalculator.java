package lv.javaguru.java1.student_milans_micko.lesson_5.homework.lvl4;

import static java.lang.Math.pow;

public class SquarePerimeterAndAreaCalculator {
    double sqrArea(int radius) {
        return Math.PI * pow(radius, 2);
    }

    double sqrPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }
}
