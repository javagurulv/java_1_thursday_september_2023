package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_3_junior.task_1;

import java.math.BigDecimal;
import java.math.RoundingMode;

class TaxCalculator {

    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal tax = BigDecimal.ZERO;

        if (income.compareTo(new BigDecimal("10000")) < 0) {
            tax = income.multiply(new BigDecimal("0.30"))
                    .setScale(2, RoundingMode.HALF_UP);
        }

        if (income.compareTo(new BigDecimal("10000")) >= 0
            && income.compareTo(new BigDecimal("50000")) < 0) {
            BigDecimal tax10k = new BigDecimal("10000").multiply(new BigDecimal("0.30"));
            BigDecimal tax10kPlus = income.subtract(new BigDecimal("10000"))
                    .multiply(new BigDecimal("0.40"));
            tax = tax10k.add(tax10kPlus).setScale(2, RoundingMode.HALF_UP);
        }

        if (income.compareTo(new BigDecimal("50000")) > 0) {
            BigDecimal tax10k = new BigDecimal("10000").multiply(new BigDecimal("0.30"));
            BigDecimal tax50k = new BigDecimal("40000")
                    .multiply(new BigDecimal("0.40"));
            BigDecimal tax50kPlus = income.subtract(new BigDecimal("50000"))
                    .multiply(new BigDecimal("0.50"));
            return tax10k.add(tax50k).add(tax50kPlus).setScale(2, RoundingMode.HALF_UP);
        }

        return tax;
    }

}
