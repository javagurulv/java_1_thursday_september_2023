package lv.javaguru.java1.student_artjoms_potasevskis.lesson_5.level_7;

import java.util.Scanner;

public class StockApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the promotion: ");
        String stockName = scanner.nextLine();

        System.out.print("Enter the number of stock quotes: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());

        var prices = getPrices(stockPriceCount, scanner);

        var maxPrice = getMaxPrice(prices);
        System.out.println("Max stock price " + stockName + ": " + maxPrice);

        var minPrice = getMinPrice(prices);
        System.out.println("Min stock price " + stockName + ": " + minPrice);

        var totalPrice = getTotalPrice(prices);
        double averagePrice = totalPrice / prices.length;
        System.out.println("Average stock price " + stockName + ": " + averagePrice);

        System.out.println("Program completed.");
    }

    private static double getTotalPrice(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice;
    }

    private static double getMinPrice(double[] prices) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    private static double getMaxPrice(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    private static double[] getPrices(int stockPriceCount, Scanner scanner) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Enter stock price " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }
}
