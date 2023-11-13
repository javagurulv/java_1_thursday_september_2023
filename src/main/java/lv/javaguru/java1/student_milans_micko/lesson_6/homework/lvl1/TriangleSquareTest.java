package lv.javaguru.java1.student_milans_micko.lesson_6.homework.lvl1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest triangleSquareTest = new TriangleSquareTest();
        triangleSquareTest.testcaseP1();
        triangleSquareTest.testcaseP2();
        triangleSquareTest.testcaseS1();
        triangleSquareTest.testcaseS2();
    }


    //testcase1 : a = 13 b = 14, c = 15; Expected Result P = 21
    public void testcaseP1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(13, 14, 15);
        if (result == 21) {
            System.out.println("a = 13, b = 14, c = 15 - it's OK");
        } else {
            System.out.println("a = 13, b = 14, c = 15 - it's FALSE");
        }
    }

    //testcase2 : a = 17, b = 28, c = 24; Expected Result P = 34.5
    public void testcaseP2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(17, 28,24);
        if (result == 34.5) {
            System.out.println("a = 17, b = 28, c = 24 - it's OK");
        } else {
            System.out.println("a = 17, b = 28, c = 24 - it's FALSE");
        }
    }

    //testcase3 : a = 13, b = 14, c = 15; Expected Result S = 84
    public void testcaseS1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(13, 14, 15);
        if (result == 84) {
            System.out.println("a = 13, b = 14, c = 15 - it's OK");
        } else {
            System.out.println("a = 13, b = 14, c = 15 - it's FALSE");
        }
    }

    //testcase4 : a = 17, b = 28 c =24; Expected Result S = 202.99245675640265
    public void testcaseS2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(17, 28, 24);
        if (result == 202.99245675640265) {
            System.out.println("a = 17, b = 28, c = 24 - it's OK");
        } else {
            System.out.println("a = 17, b = 28, c = 24 - it's FALSE");
        }
    }



}