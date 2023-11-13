package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_1_intern;

/*
тестируются значения существующих треугольников, тестируется правильность выполнения расчетов существующих треугольников;
не тестируются значения не существующих треугольников и реакция программы на них.
test case P1 : a=3, b=4, c=5 : Semi Perimeter expected result = 6;
test case P2 : a=11, b=22, c=18 : Semi Perimeter expected result = 25.5;
test case S1 : a=3, b=4, c=5 : square expected result = 6;
test case S2 : a=11, b=22, c=18 : square expected result = 98.518716495902;

 */
class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.testCaseP1();
        triangleSquareTest.testCaseP2();
        triangleSquareTest.testCaseS1();
        triangleSquareTest.testCaseS2();
    }

    public void testCaseP1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(3, 4, 5);
        if (result == 6) {
            System.out.println("TEST CASE P1 a=3, b=4, c=5 = OK");
        } else {
            System.out.println("TEST CASE P1 a=3, b=4, c=5 = FAIL");
        }
    }

    public void testCaseP2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(11, 22, 18);
        if (result == 25.5) {
            System.out.println("TEST CASE P2 a=11, b=22, c=18 = OK");
        } else {
            System.out.println("TEST CASE P2 a=11, b=22, c=18 = FAIL");
        }
    }

    public void testCaseS1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(3, 4, 5);
        if (result == 6) {
            System.out.println("TEST CASE S1 a=3, b=4, c=5 = OK");
        } else {
            System.out.println("TEST CASE S1 a=3, b=4, c=5 = FAIL");
        }
    }

    public void testCaseS2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(11, 22, 18);
        if (result == 98.51871649590244) {
            System.out.println("TEST CASE S2 a=11, b=22, c=18 = OK");
        } else {
            System.out.println("TEST CASE S2 a=11, b=22, c=18 = FAIL");
        }
    }

}
