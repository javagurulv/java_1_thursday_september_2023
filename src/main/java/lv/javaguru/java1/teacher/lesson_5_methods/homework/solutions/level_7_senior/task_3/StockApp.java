package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_7_senior.task_3;

import java.util.Scanner;

class StockApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stockName = getStockName(scanner);

        int stockPriceCount = getStockPriceCount(scanner);

        double[] prices = getStockPrices(scanner, stockPriceCount);

        double maxPrice = findMaxPrice(prices);
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        double minPrice = findMinPrice(prices);
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);

        double averagePrice = calculateAveragePrice(prices);
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

    private static double calculateAveragePrice(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        return totalPrice / prices.length;
    }

    private static double findMinPrice(double[] prices) {
        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        return minPrice;
    }

    private static double findMaxPrice(double[] prices) {
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    private static double[] getStockPrices(Scanner scanner, int stockPriceCount) {
        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }

    private static int getStockPriceCount(Scanner scanner) {
        System.out.print("Введите количество котировок акции: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private static String getStockName(Scanner scanner) {
        System.out.print("Введите название акции: ");
        return scanner.nextLine();
    }

}
