package lv.javaguru.java1.student_sergejs_roslakovs.lesson_6_unit_testing.homework.level1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.testCasePerimeter1();
        triangleSquareTest.testCasePerimeter2();
        triangleSquareTest.testCaseSquare1();
        triangleSquareTest.testCaseSquare2();
    }



    public void testCasePerimeter1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(9, 10, 11);
        if (result == 15) {
            System.out.println("Test Perimeter1 = OK");
        } else {
            System.out.println("Test Perimeter1 = FAIL");
        }
    }

    public void testCasePerimeter2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(6, 7, 8);
        if (result == 10.5) {
            System.out.println("Test Perimeter2 = OK");
        } else {
            System.out.println("Test Perimeter2 = FAIL");
        }
    }

    public void testCaseSquare1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(9, 10, 11);
        if (result == 42.42640687119285) {
            System.out.println("Test Square1 = OK");
        } else {
            System.out.println("Test Square1 = FAIL");
        }
    }

    public void testCaseSquare2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(6, 7, 8);
        if (result == 20.33316256758894) {
            System.out.println("Test Square2 = OK");
        } else {
            System.out.println("Test Square2 = FAIL");
        }
    }






}
