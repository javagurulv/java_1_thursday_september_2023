package lv.javaguru.java1.student_kirils_petrovs.lesson_7_array_for.lessoncode.myLesonCode.lesonCode;

public class FindMaxApp {

    public static void main(String[] args) {

        int[] grades = new int[6];
        grades[0] = 3;
        grades[1] = 4;
        grades[2] = 5;
        grades[3] = 4;
        grades[4] = 8;
        grades[5] = 9;

        FindMax lesson = new FindMax();

        int max = lesson.findMax(grades);
        System.out.println(max);
    }
}