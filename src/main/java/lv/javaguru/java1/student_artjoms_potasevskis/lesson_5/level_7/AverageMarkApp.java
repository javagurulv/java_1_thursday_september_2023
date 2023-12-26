package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_7;

import java.util.Scanner;

class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        String[] students = new String[studentCount];

        studentNames(studentCount, scanner, students);

        double[] grades = new double[studentCount];

        studentGrades(studentCount, students, scanner, grades);

        var average = getAverage(grades, studentCount);

        System.out.println("Students with above average:");
        for (int i = 0; i < studentCount; i++) {
            if (grades[i] > average) {
                System.out.println(students[i] + ": " + grades[i]);
            }
        }

        System.out.println("Program completed.");
    }

    private static double getAverage(double[] grades, int studentCount) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / studentCount;
        System.out.println("Average score: " + average);
        return average;
    }

    private static void studentGrades(int studentCount, String[] students, Scanner scanner, double[] grades) {
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter the grade for the student " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }
    }

    private static void studentNames(int studentCount, Scanner scanner, String[] students) {
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }
    }
}