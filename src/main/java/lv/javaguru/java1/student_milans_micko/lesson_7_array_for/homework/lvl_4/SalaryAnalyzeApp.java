package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_4;

public class SalaryAnalyzeApp {
    public static void main(String[] args) {
        int[] salariesArray = {1500, 1700, 2000, 3000};

        SalaryAnalyze salaryAnalyze = new SalaryAnalyze();
        salaryAnalyze.salaryCalculator(salariesArray);
        System.out.println("Total Salary: " + salaryAnalyze.calculateTotalSalary());
        System.out.println("Min Salary: " + salaryAnalyze.findMinSalary());
//        System.out.println("Min Salary: " + salaryAnalyze.findMinSalary2());
        System.out.println("Max Salary: " + salaryAnalyze.findMaxSalary());
        System.out.println("Average Salary: " + salaryAnalyze.findAverageSalary());


    }
}
