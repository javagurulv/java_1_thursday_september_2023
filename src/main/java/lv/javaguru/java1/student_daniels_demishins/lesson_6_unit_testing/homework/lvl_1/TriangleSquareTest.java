package lv.javaguru.java1.student_daniels_demishins.lesson_6_unit_testing.homework.lvl_1;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.testP();
        triangleSquareTest.testS();

    }

    void testP() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(5, 6, 7);
        checkResult(result, 9, "Perimetor Test ");
    }

    void testS() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(5, 6, 7);
        checkResult(result, 14.696938456699069, "Square Test ");
    }

    void checkResult(double realResult, double expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + "OK");
        } else {
            System.out.println(testName + "FAIL expected result "+expectedResult+ " but "+realResult);
        }
    }




}