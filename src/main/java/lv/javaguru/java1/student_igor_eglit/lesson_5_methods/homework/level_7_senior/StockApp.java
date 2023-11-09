package lv.javaguru.java1.student_igor_eglit.lesson_5_methods.homework.level_7_senior;

import java.util.Scanner;

class StockApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название акции: ");
        String stockName = scanner.nextLine();

        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());

        var prices = getPrices(stockPriceCount, scanner);

        var maxPrice = getMaxPrice(prices);
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        var minPrice = getMinPrice(prices);
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);

        var totalPrice = getTotalPrice(prices);
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
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
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }
        return prices;
    }
}
/*
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название акции: ");
        String stockName = scanner.nextLine();

        System.out.print("Введите количество котировок акции: ");
        int stockPriceCount = Integer.parseInt(scanner.nextLine());

        double[] prices = new double[stockPriceCount];

        for (int i = 0; i < stockPriceCount; i++) {
            System.out.print("Введите цену акции " + (i + 1) + ": ");
            prices[i] = Double.parseDouble(scanner.nextLine());
        }

        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        System.out.println("Максимальная цена акции " + stockName + ": " + maxPrice);

        double minPrice = prices[0];
        for (double price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
        }
        System.out.println("Минимальная цена акции " + stockName + ": " + minPrice);

        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice = totalPrice + price;
        }
        double averagePrice = totalPrice / prices.length;
        System.out.println("Средняя цена акции " + stockName + ": " + averagePrice);

        System.out.println("Программа завершена.");
    }

 */