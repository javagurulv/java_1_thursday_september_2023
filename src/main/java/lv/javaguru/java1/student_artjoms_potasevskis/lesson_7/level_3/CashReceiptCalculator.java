package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_3;


class CashReceiptCalculator {

    public double calculateTotalSalesSumma(CashReceipt[] receipts) {

        double totalSumma = 0.0;
        for (int i = 0; i < receipts.length; i++) {
            CashReceipt receipt = receipts[i];
            totalSumma += receipt.getSumma();

        }
        return totalSumma;
    }

    public double calculatorAverageSalesSumma(CashReceipt[] receipts) {

        if (receipts.length == 0) {
            return 0.0;
        } else {
            double totalSumma = calculateTotalSalesSumma(receipts);
            return totalSumma / receipts.length;
        }
    }
}
