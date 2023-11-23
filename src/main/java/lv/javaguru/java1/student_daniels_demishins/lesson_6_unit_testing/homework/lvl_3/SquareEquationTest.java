package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_3;

class SquareEquationTest {
    public static void main(String[] args) {
        SquareEquationTest squareEquationTest = new SquareEquationTest();
        squareEquationTest.discriminat();
        squareEquationTest.isSquareRoot();
        squareEquationTest.firstRoot();
        squareEquationTest.secondRoot();

    }


    // testcase 1 = discriminant = int 1 , int 10 , int 20
    void discriminat() {
        SquareEquation squareEquation = new SquareEquation();
        double dis = squareEquation.discriminant(1, 10, 20);
        checkResult(dis, 20, "Discriminant Test");
    }

    // testcase 2 = IsSquareRoot >= 0 ? : int 1 , int 10 , int 20
    void isSquareRoot() {
        SquareEquation squareEquation = new SquareEquation();
        boolean root = squareEquation.isSquareRoot(1, 10, 20);
        if (root) {
            System.out.println("Square Root test Ok");
        } else {
            System.out.println("Square Root test Fail");
        }
    }

    // testcase 3 = firstRoot = int 1 , int 10 , int 20
    void firstRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double firstRoot = squareEquation.firstRoot(1, 10, 20);
        checkResult(firstRoot, -7.23606797749979, "First Root Test");
    }

    // testcase 4 = secondRoot = int 1 , int 10 , int 20
    void secondRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double secondRoot = squareEquation.secondRoot(1, 10, 20);
        checkResult(secondRoot, -2.76393202250021, "Second Root Test");

    }

    void checkResult(double result, double expectedResult, String testName) {
        if (result == expectedResult) {
            System.out.println(testName + " Ok");
        } else {
            System.out.println(testName + "Fail! expected = " + expectedResult + " but result = " + result);
        }
    }
}
