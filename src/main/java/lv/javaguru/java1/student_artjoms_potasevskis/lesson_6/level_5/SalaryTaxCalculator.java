package lv.javaguru.java1.student_artjoms_potasevskis.lesson_6.level_5;

class SalaryTaxCalculator {
    public double calculate(double salary) {
        double tax = 0;
        if (salary < 0) {
            tax = 0;
        } else if (salary < 10000) {
            tax = (salary * 0.3);
        } else if ((salary >= 10000) && (salary < 50000)) {
            tax = 3000 + ((salary - 10000)* 0.4);
        } else if (salary >= 50000) {
            tax = 19000 + ((salary - 50000) * 0.5);
        } else {
            return tax;
        }
        return tax;
    }
}
