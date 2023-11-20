package lv.javaguru.java1.student_valera_kovs.lesson7;

class MathGrades {

    public float findAverageMathGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return (float) sum / grades.length;
    }
}
