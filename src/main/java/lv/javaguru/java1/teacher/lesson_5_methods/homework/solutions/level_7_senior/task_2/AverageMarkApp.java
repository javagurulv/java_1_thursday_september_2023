package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_7_senior.task_2;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = getStudentCount(scanner);
        String[] students = getStudentNames(scanner, studentCount);
        double[] grades = getStudentGrades(scanner, studentCount, students);

        double average = calculateAverageStudentGrade(studentCount, grades);
        System.out.println("Средний балл: " + average);

        findStudentsWithGradeAboveAverage(studentCount, students, grades, average);

        System.out.println("Программа завершена.");
    }

    private static int getStudentCount(Scanner scanner) {
        System.out.print("Введите количество студентов: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static void findStudentsWithGradeAboveAverage(int studentCount, String[] students, double[] grades, double average) {
        System.out.println("Студенты со средним баллом выше среднего:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }
    }

    private static double calculateAverageStudentGrade(int studentCount, double[] grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        return sum / studentCount;
    }

    private static double[] getStudentGrades(Scanner scanner, int studentCount, String[] students) {
        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
        return grades;
    }

    private static String[] getStudentNames(Scanner scanner, int studentCount) {
        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
        return students;
    }

}
