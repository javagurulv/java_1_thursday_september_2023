package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6.lvl3;

public class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest squareEquationTest = new SquareEquationTest();
        squareEquationTest.testCase1();
        squareEquationTest.testCase2();
        squareEquationTest.testCase3();
        squareEquationTest.testCase4();

    }

    public void testCase1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(-4,6,8 );
        if (result == 164) {
            System.out.println("TestCase1 = OK");
        } else {
            System.out.println("TestCase1 = FAIL");
            System.out.println("real result = " + result);
        }
    }
//discriminant(a, b, c) >= 0;
    public void testCase2() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(-4,6,8 );
        if (result >= 0) {
            System.out.println("TestCase2  = OK");
        } else {
            System.out.println("TestCase2 = FAIL");
            System.out.println("Real result = " + result);
        }
    }

    public void testCase3() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.firstRoot(-4,6,8);
        if (result >= 0.75){
            System.out.println("TestCase3 = OK");
        } else {
            System.out.println("Test Case3 = FAIL");
            System.out.println("real result = " + result);
        }
    }

    public void testCase4() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.secondRoot(5, -6, 1);
        if (result == 1) {
            System.out.println("TestCase4 = OK");
        } else {
            System.out.println("TestCase4 = FAIL");
            System.out.println("real result = " + result);
        }
    }

}


