package lv.javaguru.java1.student_valera_kovs.lesson6.lesson6;

class TriangleSquareTest {


    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.testCase1();
        triangleSquareTest.testCase2();
        triangleSquareTest.testCaseS1();
        triangleSquareTest.testCaseS2();
    }

    public void testCase1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(4, 5, 6);
        if (result == 7.5) {
            System.out.println("testCase1 OK");
        } else {
            System.out.println("testCase1  FAIL");
        }
    }

    public void testCase2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(15, 19, 23);
        if (result == 28.5) {
            System.out.println("testCase2 = OK");
        } else {
            System.out.println("testCase2 = FAIL");
        }
    }

    public void testCaseS1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(25, 11, 16);
        if (result == 62.449979984) {
            System.out.println("testCaseP1 = OK");
        } else {
            System.out.println("testCaseP1 = FAIL");
        }
    }

    public void testCaseS2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(2,16 ,14);
        if (result == 27.6586333719) {
            System.out.println("testCaseP2 OK");
        } else {
            System.out.println("testCaseP2 = FAIL");
        }
    }

}








