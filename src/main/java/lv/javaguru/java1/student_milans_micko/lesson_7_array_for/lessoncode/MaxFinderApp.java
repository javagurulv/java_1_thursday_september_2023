package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode;

class MaxFinderApp {

    public static void main(String[] args) {
        int[] grades = new int[5];
        grades [0] = 7;
        grades [1] = 2;
        grades [2] = 8;
        grades [3] = 4;
        grades [4] = 5;
        MaxFinder calculatorMathGrades = new MaxFinder();
        int max = calculatorMathGrades.findMaxGrades(grades);
        System.out.println(max);
    }
}
