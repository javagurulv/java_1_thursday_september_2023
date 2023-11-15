package lv.javaguru.java1.student_milans_micko.lesson_6_unit_testing.homework.lvl6;

class SalaryTaxCalculator {

    //testsalary1: 7000; expected result: 2100
    //testsalary2: 25000; expected result: 9000
    //testsalary3: 68000; expected result: 28000

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
