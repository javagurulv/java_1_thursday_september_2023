package lv.javaguru.java1.teacher.lesson_5_methods.homework.level_7_senior.task_3_solution;


class StockApp {

    public static void main(String[] args) {
        StockUtil stockUtil = new StockUtil();
        String stockName = stockUtil.getStockNameFromUser();

        int stockPriceCount = stockUtil.getStockPriceCountFromUser();

        double[] prices = stockUtil.getStockPricesFromUser(stockPriceCount);

        double maxPrice = stockUtil.calculateMaxPrice(prices);
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        double minPrice = stockUtil.calculateMinPrice(prices);
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);

        double averagePrice = stockUtil.calculateAveragePrice(prices);
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

}
