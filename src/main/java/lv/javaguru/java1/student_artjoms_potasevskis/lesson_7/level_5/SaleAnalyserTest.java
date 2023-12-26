package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_5;


class SaleAnalyserTest {


    public static void main(String[] args) {
        SaleAnalyserTest test = new SaleAnalyserTest();
        test.testFindBestSellingProductWithNullInput();
        test.testFindBestSellingProductWithEmptySalesArray();
        test.testFindBestSellingProductWithSingleSale();
        test.testFindBestSellingProductWithMultipleSales();
    }

    void testFindBestSellingProductWithNullInput() {
        SaleAnalyser salesAnalyser = new SaleAnalyser();
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(null);
        checkResultForNull(bestSellingProduct, "testFindBestSellingProductWithNullInput");
    }

    void testFindBestSellingProductWithEmptySalesArray() {
        SaleAnalyser salesAnalyser = new SaleAnalyser();
        Sale[] sales = new Sale[0];
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(sales);
        checkResultForNull(bestSellingProduct, "testFindBestSellingProductWithEmptySalesArray");
    }

    void testFindBestSellingProductWithSingleSale() {
        SaleAnalyser salesAnalyser = new SaleAnalyser();
        Sale[] sales = {new Sale("Product A", 10.0, 10)};
        String bestSellingProduct = salesAnalyser.findBestSellingProductByCount(sales);
        checkResult(bestSellingProduct, "Product A", "testFindBestSellingProductWithSingleSale");
    }

    void testFindBestSellingProductWithMultipleSales() {
        SaleAnalyser salesAnalyser = new SaleAnalyser();
        Sale[] sales = {
                new Sale("Product A", 10.0, 10),
                new Sale("Product B", 20.99, 5),
                new Sale("Product A", 20.0, 5),
                new Sale("Product C", 55.0, 5),
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


