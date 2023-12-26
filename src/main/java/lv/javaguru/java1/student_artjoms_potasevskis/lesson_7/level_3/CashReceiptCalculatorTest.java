package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_3;

class CashReceiptCalculatorTest {

    public static void main(String[] args) {
        CashReceiptCalculatorTest test = new CashReceiptCalculatorTest();
        test.shouldReturnZeroTotalSalesSumma();
        test.shouldReturnTotalSalesSumma();
        test.shouldReturnZeroAverageSalesSumma();
        test.shouldReturnAverageSalesSum();
    }

    public void shouldReturnZeroTotalSalesSumma() {
        CashReceipt[] receipts = {};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double totalSum = calculator.calculateTotalSalesSumma(receipts);
        checkResult(totalSum, 0.0, "shouldReturnZeroTotalSalesSum");
    }

    public void shouldReturnTotalSalesSumma() {
        CashReceipt[] receipts = {
                new CashReceipt("N1", 1.0),
                new CashReceipt("N1", 2.5),
        };
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double totalSum = calculator.calculateTotalSalesSumma(receipts);
        checkResult(totalSum, 3.5, "shouldReturnZeroTotalSalesSum");
    }

    public void shouldReturnZeroAverageSalesSumma() {
       CashReceipt[] receipts = {};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double averageReceiptSum = calculator.calculatorAverageSalesSumma(receipts);
        checkResult(averageReceiptSum, 0.0, "shouldReturnZeroAverageSalesSum");
    }

    public void shouldReturnAverageSalesSum() {
        CashReceipt[] receipts = {new CashReceipt("N1", 1.0), new CashReceipt("N1", 3.0),};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double averageReceiptSum = calculator.calculatorAverageSalesSumma(receipts);
        checkResult(averageReceiptSum, 2.0, "shouldReturnAverageSalesSum");
    }


    private void checkResult(double realResult, double expectedResult, String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
