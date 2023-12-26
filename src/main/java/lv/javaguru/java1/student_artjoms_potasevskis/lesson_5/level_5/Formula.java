package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_5;

class Formula {
    public double calculate(double principalAmount,
                            double interestRatePerYear,
                            int numberOfYearsInvested) {
        return principalAmount * Math.pow((1 + interestRatePerYear), numberOfYearsInvested);
    }

}
