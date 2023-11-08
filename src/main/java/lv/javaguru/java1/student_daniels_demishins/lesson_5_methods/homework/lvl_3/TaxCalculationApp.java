package lv.javaguru.java1.student_daniels_demishins.lesson_5_methods.homework.lvl_3;


class TaxCalculationApp {
    public static void main(String[] args) {
        TaxCalculation taxCalculation = new TaxCalculation();
        System.out.println(taxCalculation.Tax(10000));
        System.out.println(taxCalculation.Tax(50000));
        System.out.println(taxCalculation.Tax(60000));
        System.out.println(taxCalculation.Tax(-60000));

    }

}
