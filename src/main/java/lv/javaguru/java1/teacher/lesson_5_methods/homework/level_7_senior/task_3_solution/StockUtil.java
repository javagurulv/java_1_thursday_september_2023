package lv.javaguru.java1.teacher.lesson_5_methods.homework.level_7_senior.task_3_solution;

import java.util.Scanner;

class StockUtil {

    public String getStockNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название акции: ");
        return scanner.nextLine();
    }

    public int getStockPriceCountFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество котировок акции: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public double[] getStockPricesFromUser(int stockPriceCount) {
        Scanner scanner = new Scanner(System.in);
        double[] prices = new double[stockPriceCount];
        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    public double calculateMaxPrice(double[] stockPrices) {
        double maxPrice = stockPrices[0];
        for (double price : stockPrices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    public double calculateMinPrice(double[] stockPrices) {
        double minPrice = stockPrices[0];
        for (double price : stockPrices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    public double calculateAveragePrice(double[] stockPrices) {
        double totalPrice = 0.0;
        for (double price : stockPrices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice / stockPrices.length;
    }

}
