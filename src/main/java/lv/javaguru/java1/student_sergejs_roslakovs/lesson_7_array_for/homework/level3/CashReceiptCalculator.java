package lv.javaguru.java1.student_sergejs_roslakovs.lesson_7_array_for.homework.level3;

public class CashReceiptCalculator {

    public static void main(String[] args) {
        CashReceipt[] cashReceipts = {
                new CashReceipt(1, 10),
                new CashReceipt(2, 20),
                new CashReceipt(3, 15),
                new CashReceipt(4, 5),
                new CashReceipt(5, 30)
        };

        int totalSalesAmount = 0;
        for (CashReceipt cashReceipt : cashReceipts) {
            totalSalesAmount += cashReceipt.getPurchaseAmount();
        }

        int averagePurchasePrice = totalSalesAmount / cashReceipts.length;

        System.out.println("Total Sales Amount: $" + totalSalesAmount);
        System.out.println("Average Purchase Price: $" + averagePurchasePrice);
    }
}
