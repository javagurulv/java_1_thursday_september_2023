package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_4;

import java.util.Arrays;

class SalaryAnalyze {
    private int[] salaries;

    public void salaryCalculator(int[] salaries) {
        this.salaries = salaries;
    }

    public int calculateTotalSalary() {
        int totalSalary = 0;
        for (int salary : salaries) {
            totalSalary += salary;
        }
        return totalSalary;
    }

    public int findMinSalary() {
        int minSalary = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if(salaries[i] < minSalary) {
                minSalary = salaries[i];
            }
        }
        return minSalary;
    }

    public int findMinSalary2() {
        return Arrays.stream(salaries).min().orElseThrow();
    }

    public int findMaxSalary() {
        int maxSalary = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if(salaries[i] > maxSalary) {
                maxSalary = salaries[i];
            }
        }
        return maxSalary;
    }

    public double findAverageSalary() {
        return (double) calculateTotalSalary() / salaries.length;
    }
}
