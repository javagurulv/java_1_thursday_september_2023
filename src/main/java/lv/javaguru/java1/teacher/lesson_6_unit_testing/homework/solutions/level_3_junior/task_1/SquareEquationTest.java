package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_3_junior.task_1;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.shouldCalculateDiscriminant();
        test.isSquareRootEqualsZero();
        test.isSquareRootLessThenZero();
        test.isSquareRootBiggerThenZero();
        test.shouldCalculateFirstRoot();
        test.shouldCalculateSecondRoot();
    }

    public void shouldCalculateDiscriminant() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(1, 2, 3);
        checkResult(realResult, -8.0, "shouldCalculateDiscriminant");
    }

    public void isSquareRootEqualsZero() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(2, 4, 2);
        checkResult(realResult, true, "isSquareRootEqualsZero");
    }

    public void isSquareRootLessThenZero() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(2, 0, 2);
        checkResult(realResult, false, "isSquareRootLessThenZero");
    }

    public void isSquareRootBiggerThenZero() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(2, 10, 2);
        checkResult(realResult, true, "isSquareRootBiggerThenZero");
    }

    public void shouldCalculateFirstRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.firstRoot(2, 4, 2);
        checkResult(realResult, -1.0, "shouldCalculateFirstRoot");
    }

    public void shouldCalculateSecondRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.secondRoot(2, 4, 2);
        checkResult(realResult, -1.0, "shouldCalculateSecondRoot");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double epsilon = 0.000001d;
        if (Math.abs(realResult - expectedResult) < epsilon) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! expected = " + expectedResult + " but realResult = " + realResult);
        }
    }

}
