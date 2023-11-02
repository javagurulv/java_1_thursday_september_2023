package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_5_middle.task_1;

class CompoundInterestFormulaDemo {

    public static void main(String[] args) {
        CompoundInterestFormula formula = new CompoundInterestFormula();
        System.out.println("Principal = 1000.0, " +
                "interestRatePerYear = 0.02, " +
                "numberOfYearsInvested = 10 = "
                + formula.calculate(1000.0, 0.02, 10));
        System.out.println("Principal = 1000.0, " +
                "interestRatePerYear = 0.05, " +
                "numberOfYearsInvested = 10 = "
                + formula.calculate(1000.0, 0.05, 10));
        System.out.println("Principal = 1000.0, " +
                "interestRatePerYear = 0.1, " +
                "numberOfYearsInvested = 10 = "
                + formula.calculate(1000.0, 0.1, 10));
    }

}
