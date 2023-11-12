package lv.javaguru.java1.student_igor_eglit.lesson_6_unit_testing.homework.level_6_middle;

class SalaryTaxCalculator {

    public double calculate(double salary) {

        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            //tax = (salary / 100) * 30;
            tax = salaryFrom0to10000(salary);
        } else if ((salary >= 10000) && (salary < 50000)) {
            //tax = (((salary) / 100) * 40);
            tax = salaryFrom10000to50000(salary);
        } else if (salary >= 50000) {
            // tax = (((salary) / 100) * 50);
            tax = salaryFrom50000(salary);
        } else {
            return tax;
        }
        return tax;
    }

    private double salaryFrom0to10000(double salary) {
        return (salary / 100) * 30;
    }

    private double salaryFrom10000to50000(double salary) {
        return (((salary) / 100) * 40);
    }

    private double salaryFrom50000(double salary) {
        return (((salary) / 100) * 50);
    }
}

