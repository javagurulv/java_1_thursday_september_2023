package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_5.homework;


class TaxCalculator {
    public static void main(String[] args) {

        System.out.println(calculateTax(5000));  // Налог: 1500.0 (30%)
        System.out.println(calculateTax(20000)); // Налог: 8000.0 (40%)
        System.out.println(calculateTax(70000)); // Налог: 35000.0 (50%)
        System.out.println(calculateTax(9000));  // Налог: 2700.0 (30%)
    }

  static double calculateTax(double income) {

        if (income <= 10000) {
            return income * 0.3;
        } else if (income <= 50000) {
            return 10000 * 0.3 + (income - 10000) * 0.4;
        } else {
            return 10000 * 0.3 + 40000 * 0.4 + (income - 50000) * 0.5;
        }
    }
}
