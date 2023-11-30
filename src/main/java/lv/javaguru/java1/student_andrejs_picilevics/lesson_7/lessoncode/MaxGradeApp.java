package lv.javaguru.java1.student_andrejs_picilevics.lesson_7.lessoncode;

public class MaxGradeApp {
    public static void main(String[] args) {
    int[] grades = new int[5];
    grades[0] = 7;
    grades[1] = 8;
    grades[2] = 9;
    grades[3] = 4;
    grades[4] = 2;
    MaxGrade maxGrade = new MaxGrade();
        System.out.println(maxGrade.findMaxGrade(grades));
    }
}
