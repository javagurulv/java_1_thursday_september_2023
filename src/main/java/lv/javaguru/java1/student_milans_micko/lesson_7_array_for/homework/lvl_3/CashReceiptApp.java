package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_3;

public class CashReceiptApp {

    public static double calculateTotalSales(CashReceipt[] receipts) {
        double totalSales = 0;
        for (int i = 0; i <= receipts.length; i++ ) {
            CashReceipt receipt = receipts[i];
            totalSales += receipt.getSum();
        }
        return totalSales;
    }

    public static double averagePurchasePrice(CashReceipt[] receipts) {
        if (receipts.length == 0) {
            return 0.0;
        } else {
            double totalSales = calculateTotalSales(receipts);
            return totalSales / receipts.length;
        }
    }
}
