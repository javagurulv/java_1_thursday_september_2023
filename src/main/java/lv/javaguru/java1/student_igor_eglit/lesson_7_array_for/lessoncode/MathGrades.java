package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class MathGrades {

    public float findAverageMathGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (float) sum / grades.length;
    }
}
