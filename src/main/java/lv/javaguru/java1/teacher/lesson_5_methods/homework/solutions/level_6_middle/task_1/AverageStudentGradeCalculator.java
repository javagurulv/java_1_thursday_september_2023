package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_6_middle.task_1;

class AverageStudentGradeCalculator {

    public double calculate(StudentReportCard reportCard) {
        int gradeSum = reportCard.getMathGrade() + reportCard.getEngGrade() + reportCard.getBiologyGrade() + reportCard.getSportGrade();
        return gradeSum / (double) 4;
    }

}
