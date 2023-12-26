package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_3;
class SquareEquationTest {
    public static void main(String[] args) {
       SquareEquationTest squareEquationTest = new SquareEquationTest();
       squareEquationTest.testCaseD1();
       squareEquationTest.testCaseSQR1();
       squareEquationTest.testCaseFR1();
       squareEquationTest.testCaseSR1();

    }

    public void testCaseD1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(4, 8, 4);
        if (result == -2) {
            System.out.println("Test Case d1 : a =4, b=8, c=4 : expected result = -2  -  OK");
        } else {
            System.out.println("Test Case d1 : a =5, b=-6, c=1 : expected result = 16  -  FAIL");
            System.out.println("real result = " + result);
        }
    }

    public void testCaseSQR1() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(1, 2, 3);
        if (result) {
            System.out.println("Test Case SQR1 : a =1, b=2, c=3 : expected result = true  -  OK");
        } else {
            System.out.println("Test Case SQR1 : a =1, b=2, c=3 : expected result = true  -  FAIL");
            System.out.println("Real result = " + result);
        }
    }

    public void testCaseFR1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.firstRoot(5, -6, 1);
        if (result == 0.2){
            System.out.println("Test Case fR1 : a =5, b=-6, c=1 : expected result = 0.2-  OK");
        } else {
            System.out.println("Test Case fR1 : a =5, b=-6, c=1 : expected result = 0.2-  FAIL");
            System.out.println("real result = " + result);
        }
    }

    public void testCaseSR1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.secondRoot(3, 6, 9);
        if (result == 1.0) {
            System.out.println("Test Case sR1 : a =3, b=6, c=9 : expected result = 1.0  OK");
        } else {
            System.out.println("Test Case sR1 : a =3, b=6, c=9 : expected result = 1.0 - FAIL");
            System.out.println("real result = " + result);
        }
    }
}
