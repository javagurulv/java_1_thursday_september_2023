package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_5;

class FormulaApp {
    public static void main(String[] args) {
        Formula formula = new Formula();
        System.out.println("Principal = 1000.0, " + "interestRatePerYear = 0.02, " + "numberOfYearsInvested = 10 = "
                + formula.calculate(1000.0, 0.02, 10));
        System.out.println("Principal = 1000.0, " + "interestRatePerYear = 0.05, " + "numberOfYearsInvested = 10 = "
                + formula.calculate(1000.0, 0.05, 10));
        System.out.println("Principal = 1000.0, " + "interestRatePerYear = 0.1, " + "numberOfYearsInvested = 10 = "
                + formula.calculate(1000.0, 0.1, 10));
    }
}
