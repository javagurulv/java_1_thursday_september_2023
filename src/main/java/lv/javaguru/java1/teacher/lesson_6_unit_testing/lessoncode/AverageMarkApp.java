package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

class AverageMarkApp {

    public static void main(String[] args) {
        AverageMark averageMark = new AverageMark();

        int studentCount = averageMark.getStudentCount();

        String[] students = averageMark.getStudentNames(studentCount);

        double[] grades = averageMark.getStudentGrades(studentCount, students);

        double sum = averageMark.calculateGradeSum(grades);

        double average = averageMark.calculateAverageGrade(sum, studentCount);
        System.out.println("Средний балл: " + average);

        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }

        System.out.println("Программа завершена.");
    }

}
