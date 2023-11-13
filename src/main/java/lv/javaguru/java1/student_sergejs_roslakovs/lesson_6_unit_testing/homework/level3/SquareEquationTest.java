package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.homework.level3;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest squareEquationTest = new SquareEquationTest();
        squareEquationTest.testCaseD();
        squareEquationTest.testCaseEqualsZero();
        squareEquationTest.testCaseMoreThanZero();
        squareEquationTest.testCaseLessThanZero();


    }

    public void testCaseD() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(-7, 5, 2);
        if (result == 81) {
            System.out.println("Test Case D = OK");
        } else {
            System.out.println("Test Case D = FAIL");
            System.out.println("Real result = " + result);
        }
    }

    public void testCaseEqualsZero() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(-7, 5, 2);
        if (result == 0) {
            System.out.println("Test Case EqualsZero = OK");
        } else {
            System.out.println("Test Case EqualsZero = FAIL");
            System.out.println("Real result = " + result);
        }
    }

    public void testCaseMoreThanZero() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(-7, 5, 2);
        if (result >= 0) {
            System.out.println("Test Case MoreThanZero = OK");
        } else {
            System.out.println("Test Case MoreThanZero = FAIL");
            System.out.println("Real result = " + result);
        }
    }

    public void testCaseLessThanZero() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(-7, 5, 2);
        if (result <= 0) {
            System.out.println("Test Case LessThanZero = OK");
        } else {
            System.out.println("Test Case LessThanZero = FAIL");
            System.out.println("Real result = " + result);
        }
    }




}
