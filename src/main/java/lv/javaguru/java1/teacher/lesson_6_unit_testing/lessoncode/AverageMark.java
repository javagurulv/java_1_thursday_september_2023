package lv.javaguru.java1.teacher.lesson_6_unit_testing.lessoncode;

import java.util.Scanner;

class AverageMark {

    public int getStudentCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        return scanner.nextInt();
    }

    public String[] getStudentNames(int studentCount) {
        Scanner scanner = new Scanner(System.in);
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }

        return students;
    }

    public double[] getStudentGrades(int studentCount, String[] students) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }

        return grades;
    }

    public double calculateGradeSum(double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public double calculateAverageGrade(double gradeSum, int studentCount) {
        return gradeSum / studentCount;
    }


}
