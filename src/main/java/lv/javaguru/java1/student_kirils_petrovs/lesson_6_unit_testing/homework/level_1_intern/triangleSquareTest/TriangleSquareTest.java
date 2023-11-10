package lv.javaguru.java1.student_kirils_petrovs.lesson_6_unit_testing.homework.level_1_intern.triangleSquareTest;

public class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.test1();
    }

    public void test1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(5, 7, 8);
        checkResult(result, 17.32, "Test 1");
    }

    private void checkResult(double realResult, double expectedResult, String testScenarioName) {
        if (Math.abs(realResult - expectedResult) < 0.01) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}