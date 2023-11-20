package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class MaxGradeApp {
    public static void main(String[] args) {
        MaxGradeFinder maxGrade = new MaxGradeFinder();

        int[] studentGrades = maxGrade.gradeArray();

        studentGrades[0] = 3;
        studentGrades[1] = 6;
        studentGrades[2] = 8;
        studentGrades[3] = 6;
        studentGrades[4] = 10;

        int[] studentsGrades = {2, 6, 8, 6, 9};

        System.out.println("Max Grade = " + maxGrade.findMaxGrade(studentsGrades));
        System.out.println("Min Grade = " + maxGrade.findMinGrade(studentsGrades));
        System.out.println("Max Grade = " + maxGrade.findMaxGrade(studentGrades));
        System.out.println("Min Grade = " + maxGrade.findMinGrade(studentGrades));


    }
}
