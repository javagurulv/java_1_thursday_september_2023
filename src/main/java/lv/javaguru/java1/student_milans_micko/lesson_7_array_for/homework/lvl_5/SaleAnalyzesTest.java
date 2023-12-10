package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_5;

import java.util.Objects;
class SaleAnalyzesTest {

    public Sale[] createSaleRecords() {
        return new Sale[]{
                new Sale("Product 1", 39.99, 19),
                new Sale("Product 2", 42.99, 7),
                new Sale("Product 3", 11.99, 84),
                new Sale("Product 4", 120.99, 15)
        };
    }

    private static void resultDisplay(String expectedResult, String realResult, String testName) {
        if (Objects.equals(expectedResult, realResult)) {
            System.out.println(testName + " confirmed, OK");
        }else {
            System.out.println(testName + " failed");
        }
    }

    public static void main(String[] args) {
        SaleAnalyzesTest saleAnalyzesTest = new SaleAnalyzesTest();
        saleAnalyzesTest.bestSellingTest();
        saleAnalyzesTest.biggestTurnoverTest();
    }

    private void bestSellingTest() {
        SaleAnalyzes saleAnalyzes = new SaleAnalyzes();
        String bestSellingProduct = saleAnalyzes.bestSellingProduct(createSaleRecords());
        System.out.println(saleAnalyzes.bestSellingProduct(createSaleRecords()));
        resultDisplay("Product 3",bestSellingProduct,"Test to find the bestselling product is");
    }

    private void biggestTurnoverTest() {
        SaleAnalyzes saleAnalyzes = new SaleAnalyzes();
        String biggestTurnover = saleAnalyzes.biggestTurnoverProd(createSaleRecords());
        resultDisplay("Product 4",biggestTurnover,"Test to find the biggest turnover product is");

    }
}
