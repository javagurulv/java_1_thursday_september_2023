package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_1_intern.task_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.shouldCalculateSemiPerimeter();
        test.shouldCalculateSquare();
    }

    public void shouldCalculateSemiPerimeter() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double semiPerimeter = triangleSquare.calculateSemiPerimeter(4, 3, 5);
        checkResult(semiPerimeter, 6.0, "shouldCalculateSemiPerimeter");
    }

    public void shouldCalculateSquare() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double square = triangleSquare.calculateSquare(4, 3, 5);
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
