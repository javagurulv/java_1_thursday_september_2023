package lv.javaguru.java1.student_danil_sitiakov.lesson_6;

import lv.javaguru.java1.student_valera_kovs.lesson6.lesson6.TriangleSquare;

public class TriangleSquareTest {

    public void test1() {
        int a = 10; // input
        int b = 15;
        int c = 13;
        TriangleSquare perimeter = new TriangleSquare();
        double result = perimeter.calculateSemiPerimeter(a, b, c);
        checkResult(result, 19, "test1");
    }

    private void checkResult(double result, int i, String test1) {
    }
}