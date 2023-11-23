package lv.javaguru.java1.student_sergejs_roslakovs.lesson_7_array_for.homework.level4;

class PayrollAnalysis {

    public static void main(String[] args) {
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};

        double totalExpenses = 0;
        for (int i = 0; i < salaries.length; i++) {
            totalExpenses += salaries[i];
        }

        double minSalary = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] < minSalary) {
                minSalary = salaries[i];
            }
        }

        double maxSalary = salaries[0];
        for (int i = 1; i < salaries.length; i++) {
            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
            }
        }

        double averageSalary = totalExpenses / salaries.length;

        double squaredDifferencesSum = 0;
        for (int i = 0; i < salaries.length; i++) {
            double difference = salaries[i] - averageSalary;
            squaredDifferencesSum += difference * difference;
        }
        double meanSquaredDifference = squaredDifferencesSum / salaries.length;
        double standardDeviation = Math.sqrt(meanSquaredDifference);

        System.out.println("General expenses for salaries: " + totalExpenses);
        System.out.println("Minimum wage: " + minSalary);
        System.out.println("Maximum salary: " + maxSalary);
        System.out.println("Average salary: " + averageSalary);
        System.out.println("Standard deviation: " + standardDeviation);
    }
}

