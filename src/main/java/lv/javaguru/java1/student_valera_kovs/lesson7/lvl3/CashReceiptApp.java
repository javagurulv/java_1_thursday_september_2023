package lv.javaguru.java1.student_valera_kovs.lesson7.lvl3;


public class CashReceiptApp {

    public static double TotalSales(CashReceipt[] receipts) {
        double sum = 0;
        for (int i = 0; i <= receipts.length; i++ ) {
            CashReceipt receipt = receipts[i];
           sum += receipt.getSum();
        }
        return sum;
    }

    public static double CalculateTheAverageAmount(CashReceipt[] receipts) {
        if (receipts.length == 0) {
            return 0.0;
        } else {
            double totalSales = TotalSales(receipts);
            return totalSales / receipts.length;
        }
    }
}