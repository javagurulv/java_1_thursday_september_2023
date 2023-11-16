package lv.javaguru.java1.teacher.lesson_7_array_for.homework.solutions.level_4_middle.task_1;

class SalaryAnalyser {

    public double calculateTotalSalaryExpenses(double[] salaries) {
        double totalSalaryExpenses = 0.0;
        for (int i = 0; i < salaries.length; i++) {
            totalSalaryExpenses += salaries[i];
        }
        return totalSalaryExpenses;
    }

    public double findMinSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0.0;
        } else {
            double minSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                if (minSalary > salaries[i]) {
                    minSalary = salaries[i];
                }
            }
            return minSalary;
        }
    }

    public double findMaxSalary(double[] salaries) {
        if (salaries.length == 0) {
            return 0.0;
        } else {
            double maxSalary = salaries[0];
            for (int i = 0; i < salaries.length; i++) {
                if (maxSalary < salaries[i]) {
                    maxSalary = salaries[i];
                }
            }
            return maxSalary;
        }
    }

    public double calculateAverageSalary(double[] salaries) {
        double totalSalary = calculateTotalSalaryExpenses(salaries);
        if (salaries.length == 0) {
            return 0.0;
        } else {
            return totalSalary / salaries.length;
        }
    }

}
