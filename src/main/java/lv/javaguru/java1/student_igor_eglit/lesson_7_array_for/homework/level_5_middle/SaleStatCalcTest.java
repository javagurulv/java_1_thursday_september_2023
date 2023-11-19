package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_5_middle;

import java.util.Objects;

class SaleStatCalcTest {
    public Sale[] createSaleRecords() {
        return new Sale[]{
                new Sale("Product 1", 35.99, 15),
                new Sale("Product 2", 44.99, 14),
                new Sale("Product 3", 19.99, 29),
                new Sale("Product 4", 99.99, 7)
        };
    }private static void resultDisplay(String expectedResult, String realResult, String testName) {
        if (Objects.equals(expectedResult, realResult)) {
            System.out.println(testName + " confirmed, OK");
        }else {
            System.out.println(testName + " failed");
        }
    }
    public static void main(String[] args) {
        SaleStatCalcTest saleStatCalcTest = new SaleStatCalcTest();
        saleStatCalcTest.bestSellingTest();
        saleStatCalcTest.biggestTurnoverTest();
    }

    private void bestSellingTest() {
        SaleStatCalc saleStatCalc = new SaleStatCalc();
        String bestSellingProduct = saleStatCalc.bestSellingProduct(createSaleRecords());
        resultDisplay("Product 3",bestSellingProduct,"Test to find the bestselling product is");

    }

    private void biggestTurnoverTest() {
        SaleStatCalc saleStatCalc = new SaleStatCalc();
        String biggestTurnover = saleStatCalc.biggestTurnoverProd(createSaleRecords());
        resultDisplay("Product 4",biggestTurnover,"Test to find the biggest turnover product is");

    }
}
