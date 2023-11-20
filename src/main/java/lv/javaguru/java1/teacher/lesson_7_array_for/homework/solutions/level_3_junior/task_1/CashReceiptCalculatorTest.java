package lv.javaguru.java1.teacher.lesson_7_array_for.homework.solutions.level_3_junior.task_1;

class CashReceiptCalculatorTest {

    public static void main(String[] args) {
        CashReceiptCalculatorTest test = new CashReceiptCalculatorTest();
        test.shouldReturnZeroTotalSalesSum();
        test.shouldReturnTotalSalesSum();
        test.shouldReturnZeroAverageSalesSum();
        test.shouldReturnAverageSalesSum();
    }

    public void shouldReturnZeroTotalSalesSum() {
        CashReceipt[] receipts = {};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double totalSum = calculator.calculateTotalSalesSum(receipts);
        checkResult(totalSum, 0.0, "shouldReturnZeroTotalSalesSum");
    }

    public void shouldReturnTotalSalesSum() {
        CashReceipt[] receipts = {
                new CashReceipt("N1", 1.0),
                new CashReceipt("N1", 2.5),
        };
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double totalSum = calculator.calculateTotalSalesSum(receipts);
        checkResult(totalSum, 3.5, "shouldReturnZeroTotalSalesSum");
    }

    public void shouldReturnZeroAverageSalesSum() {
        CashReceipt[] receipts = {};
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double averageReceiptSum = calculator.calculateAverageReceiptSum(receipts);
        checkResult(averageReceiptSum, 0.0, "shouldReturnZeroAverageSalesSum");
    }

    public void shouldReturnAverageSalesSum() {
        CashReceipt[] receipts = {
                new CashReceipt("N1", 1.0),
                new CashReceipt("N1", 3.0),
        };
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        double averageReceiptSum = calculator.calculateAverageReceiptSum(receipts);
        checkResult(averageReceiptSum, 2.0, "shouldReturnAverageSalesSum");
    }


    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }


}
