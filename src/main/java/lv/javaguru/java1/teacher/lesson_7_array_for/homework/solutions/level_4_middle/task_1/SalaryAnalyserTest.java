package lv.javaguru.java1.teacher.lesson_7_array_for.homework.solutions.level_4_middle.task_1;

class SalaryAnalyserTest {

    public static void main(String[] args) {
        SalaryAnalyserTest test = new SalaryAnalyserTest();
        test.shouldReturnZeroTotalSalaryExpenses();
        test.shouldReturnTotalSalaryExpenses();
        test.shouldReturnZeroMinSalary();
        test.shouldReturnMinSalary();
        test.shouldReturnZeroMaxSalary();
        test.shouldReturnMaxSalary();
        test.shouldReturnZeroAverageSalary();
        test.shouldReturnAverageSalary();
    }

    public void shouldReturnZeroTotalSalaryExpenses() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {};
        double totalSalaryExpenses = salaryAnalyser.calculateTotalSalaryExpenses(salaries);
        checkResult(totalSalaryExpenses, 0.0, "shouldReturnZeroTotalSalaryExpenses");
    }

    public void shouldReturnTotalSalaryExpenses() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {1.0, 2.0};
        double totalSalaryExpenses = salaryAnalyser.calculateTotalSalaryExpenses(salaries);
        checkResult(totalSalaryExpenses, 3.0, "shouldReturnTotalSalaryExpenses");
    }

    public void shouldReturnZeroMinSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {};
        double minSalary = salaryAnalyser.findMinSalary(salaries);
        checkResult(minSalary, 0.0, "shouldReturnZeroMinSalary");
    }

    public void shouldReturnMinSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {1.0, 2.0, 0.5};
        double minSalary = salaryAnalyser.findMinSalary(salaries);
        checkResult(minSalary, 0.5, "shouldReturnMinSalary");
    }

    public void shouldReturnZeroMaxSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {};
        double maxSalary = salaryAnalyser.findMaxSalary(salaries);
        checkResult(maxSalary, 0.0, "shouldReturnZeroMaxSalary");
    }

    public void shouldReturnMaxSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {1.0, 2.0, 0.5};
        double maxSalary = salaryAnalyser.findMaxSalary(salaries);
        checkResult(maxSalary, 2.0, "shouldReturnMaxSalary");
    }

    public void shouldReturnZeroAverageSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {};
        double averageSalary = salaryAnalyser.calculateAverageSalary(salaries);
        checkResult(averageSalary, 0.0, "shouldReturnZeroAverageSalary");
    }

    public void shouldReturnAverageSalary() {
        SalaryAnalyser salaryAnalyser = new SalaryAnalyser();
        double[] salaries = {1.0, 2.0, 3.0};
        double averageSalary = salaryAnalyser.calculateAverageSalary(salaries);
        checkResult(averageSalary, 2.0, "shouldReturnAverageSalary");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
