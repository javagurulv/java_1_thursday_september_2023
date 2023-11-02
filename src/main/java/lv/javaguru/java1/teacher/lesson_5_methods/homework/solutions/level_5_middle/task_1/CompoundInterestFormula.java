package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_5_middle.task_1;

class CompoundInterestFormula {

    public double calculate(double principalAmount,
                            double interestRatePerYear,
                            int numberOfYearsInvested) {
        return principalAmount * Math.pow((1 + interestRatePerYear), numberOfYearsInvested);
    }

}
