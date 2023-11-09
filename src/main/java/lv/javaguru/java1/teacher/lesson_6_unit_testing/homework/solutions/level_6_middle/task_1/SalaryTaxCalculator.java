package lv.javaguru.java1.teacher.lesson_6_unit_testing.homework.solutions.level_6_middle.task_1;

class SalaryTaxCalculator {

    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = calculateTaxUnder10k(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = calculateTaxUnder50k(salary);
        } else if (salary >= 50000) {
            tax = calculateTaxMoreThen50k(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private double calculateTaxMoreThen50k(double salary) {
        return 19000 + (((salary - 50000) / 100) * 50);
    }

    private double calculateTaxUnder50k(double salary) {
        return 3000 + (((salary - 10000) / 100) * 40);
    }

    private double calculateTaxUnder10k(double salary) {
        return (salary / 100) * 30;
    }

}
