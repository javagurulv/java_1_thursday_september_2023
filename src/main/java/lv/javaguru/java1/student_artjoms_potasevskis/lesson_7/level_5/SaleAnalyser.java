package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_5;

class SaleAnalyser {

    public String findBestSellingProductByCount(Sale[] sales) {
        return isNullOrEmpty(sales) ? null : findBestSellingProductByCountForNotNullSales(sales);
    }

    public String findBestSellingProductByCountForNotNullSales(Sale[] sales) {
        String bestSellingProduct = sales[0].getProduct();
        int salesCount = calculateSalesUnitCount(sales, bestSellingProduct);
        for (int i = 0; i < sales.length; i++) {
            if (calculateSalesUnitCount(sales, sales[i].getProduct()) > salesCount) {
                bestSellingProduct = sales[i].getProduct();
                salesCount = calculateSalesUnitCount(sales, bestSellingProduct);
            }
        }
        return bestSellingProduct;
    }

    private boolean isNullOrEmpty(Sale[] sales) {
        return (sales == null) || (sales.length == 0);
    }

    private int calculateSalesUnitCount(Sale[] sales, String product) {
        int salesUnitCount = 0;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
            if (product.equals(sale.getProduct())) {
                salesUnitCount += sale.getUnitCount();
            }
        }
        return salesUnitCount;
    }

}
