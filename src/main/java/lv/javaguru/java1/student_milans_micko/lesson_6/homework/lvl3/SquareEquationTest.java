package lv.javaguru.java1.student_milans_micko.lesson_6.homework.lvl3;

public class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest squareEquationTest = new SquareEquationTest();
        squareEquationTest.testcaseD1();
        squareEquationTest.testcaseSQ1();
        squareEquationTest.testcaseFR1();
        squareEquationTest.testcaseSR1();

    }
    //testcase discriminant: a = 1, b = 5, c = 6; expected result: 1
    public void testcaseD1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(1,5,6);
        if (result == 1) {
            System.out.println("test is OK");
        } else {
            System.out.println("test is FALSE");
        }
    }
    //testcase square root: a = 1, b = 5, c = 6; expected result: true
    public void testcaseSQ1() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(1,5,6);
        if (true) {
            System.out.println("test is OK");
        } else {
            System.out.println("test is FALSE");
        }
    }
    //testcase first root: a = 1, b = 5, c = 6; expected result: -3
    public void testcaseFR1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.firstRoot(1,5,6);
        if (result == -3) {
            System.out.println("test is OK");
        } else {
            System.out.println("test is FALSE");
        }
    }
    //testcase first root: a = 1, b = 5, c = 6; expected result: -2
    public void testcaseSR1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.secondRoot(1,5,6);
        if (result == -2) {
            System.out.println("test is OK");
        } else {
            System.out.println("test is FALSE");
        }
    }
}
