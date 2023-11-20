package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_6_senior;

class StockCalculatorTest {
    public Stock[] stockPortfolio() {
        return new Stock[]{
                new Stock("AVAN", 1164., 4.9),
                new Stock("SELG", 70.2, 2.85),
                new Stock("POSI", 2064., 0.77),
                new Stock("RTKMP", 75.8, 7.19),
        };
    }

    public void displayTestResult(double expectedResult, double realResult, String testDescription) {
        if (expectedResult == realResult) {
            System.out.println(testDescription + " confirmed OK");
        } else {
            System.out.println(testDescription + " FAILED");
        }
    }

    public static void main(String[] args) {
        StockCalculatorTest stockCalculatorTest = new StockCalculatorTest();
        stockCalculatorTest.sumAssetValueTest();
        stockCalculatorTest.averagePortfolioReturnTest();
        stockCalculatorTest.totalPortfolioReturnTest();
    }

    public void sumAssetValueTest() {
        StockCalculator stockCalculator = new StockCalculator();
        double realResult = stockCalculator.sumAssetValue(stockPortfolio());
        displayTestResult(3374, realResult, "Test sumAssetValueTest was ");
    }

    public void averagePortfolioReturnTest() {
        StockCalculator stockCalculator = new StockCalculator();
        double realResult = stockCalculator.averagePortfolioReturn(stockPortfolio());
        displayTestResult(20.09488, realResult, "Test averagePortfolioReturnTest was ");
    }
    public void totalPortfolioReturnTest(){
        StockCalculator stockCalculator =  new StockCalculator();
        double realResult = stockCalculator.totalPortfolioReturn(stockPortfolio());
        displayTestResult(80.37952,realResult,"Test totalPortfolioReturnTest was ");
    }
}
