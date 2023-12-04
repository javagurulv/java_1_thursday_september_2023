package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_7;
import java.util.Scanner;
class AverageMarkApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        String[] students = new String[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите имя студента " + (i + 1) + ": ");
            String studentName = scanner.nextLine();
            students[i] = studentName;
        }

        double[] grades = new double[studentCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.print("Введите оценку для студента " + students[i] + ": ");
            double grade = Double.parseDouble(scanner.nextLine());
            grades[i] = grade;
        }

        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        double average = sum / studentCount;
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
