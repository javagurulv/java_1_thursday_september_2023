package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_1;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.shouldCalculateSemiPerimeter();
        test.shouldCalculateSquare();
    }

    public void shouldCalculateSemiPerimeter() {
       TriangleSquare triangleSquare = new TriangleSquare();
        double semiPerimeter = triangleSquare.calculateSemiPerimeter(5, 4, 6);
        checkResult(semiPerimeter, 7.5, "shouldCalculateSemiPerimeter");
    }

    public void shouldCalculateSquare() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double square = triangleSquare.calculateSquare(5, 4, 6);
        checkResult(square, 6.0, "shouldCalculateSquare");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }


}
