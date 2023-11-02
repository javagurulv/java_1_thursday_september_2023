package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_6_middle.task_1;

class AverageStudentGradeCalculatorDemo {

    public static void main(String[] args) {
        AverageStudentGradeCalculator averageGradeCalculator
                = new AverageStudentGradeCalculator();

        StudentReportCard reportCard1 = new StudentReportCard(
                10, 4, 5, 7
        );
        System.out.println("Average grade = " + averageGradeCalculator.calculate(reportCard1));

        StudentReportCard reportCard2 = new StudentReportCard(
                5, 8, 5, 6
        );
        System.out.println("Average grade = " + averageGradeCalculator.calculate(reportCard2));
    }

}
