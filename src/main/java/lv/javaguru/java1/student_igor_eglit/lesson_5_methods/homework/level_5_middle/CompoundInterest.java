package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_5_middle;

import static java.lang.Math.pow;

/*
Формула сложного процента записывается: S=X*(1+%)n, где

S — конечная сумма;
X — начальный вклад;
% — годовая ставка;
n — количество периодов.
 */
class CompoundInterest {
    double finalAmount;

    double compoundInterestCalculation(double startingDeposit, double yearRate, double numberOfPeriod) {
        return finalAmount = startingDeposit * pow((1 + (yearRate / 100)), numberOfPeriod);
    }

}
