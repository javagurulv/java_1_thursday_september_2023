package lv.javaguru.java1.student_milans_micko.lesson_6.homework.lvl1;

class TriangleSquare {

    //testcase1 : a = 13, b = 14, c = 15; Expected Result P = 21
    //testcase2 : a = 17, b = 28, c = 24; Expected Result P = 34.5
    //testcase3 : a = 13, b = 14, c = 15; Expected Result s = 84
    //testcase4 : a = 17, b = 28, c = 24; Expected Result s = 202.99245675640265

    public double calculateSquare(int a, int b, int c) {
        double s = calculateSemiPerimeter(a, b, c);
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateSemiPerimeter(int a, int b, int c) {
        return (a + b + c) / (double) 2;
    }

}
