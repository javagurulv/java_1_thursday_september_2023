package lv.javaguru.java1.teacher.lesson_7_array_for.homework.solutions.level_5_middle.task_1;

class SalesAnalyserTest {

    public static void main(String[] args) {
        SalesAnalyserTest test = new SalesAnalyserTest();
        test.testFindBestSellingProductWithNullInput();
        test.testFindBestSellingProductWithEmptySalesArray();
        test.testFindBestSellingProductWithSingleSale();
        test.testFindBestSellingProductWithMultipleSales();
    }

    void testFindBestSellingProductWithNullInput() {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(null);
        checkResultForNull(bestSellingProduct, "testFindBestSellingProductWithNullInput");
    }

    void testFindBestSellingProductWithEmptySalesArray() {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        Sale[] sales = new Sale[0];
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(sales);
        checkResultForNull(bestSellingProduct, "testFindBestSellingProductWithEmptySalesArray");
    }

    void testFindBestSellingProductWithSingleSale() {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        Sale[] sales = {new Sale("Product A", 10.0, 10)};
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(sales);
        checkResult(bestSellingProduct, "Product A", "testFindBestSellingProductWithSingleSale");
    }

    void testFindBestSellingProductWithMultipleSales() {
        SalesAnalyser salesAnalyser = new SalesAnalyser();
        Sale[] sales = {
                new Sale("Product A", 10.0, 10),
                new Sale("Product B", 5.0, 5),
                new Sale("Product A", 20.0, 5),
                new Sale("Product C", 15.0, 5),
                new Sale("Product B", 8.0, 5)
        };
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(sales);
        checkResult(bestSellingProduct, "Product A", "testFindBestSellingProductWithMultipleSales");
    }

    private void checkResultForNull(String realResult,
                                    String testScenarioName) {
        if (realResult == null) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

    private void checkResult(String realResult,
                             String expectedResult,
                             String testScenarioName) {
        if (realResult.equals(expectedResult)) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}
