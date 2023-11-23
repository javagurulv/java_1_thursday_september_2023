package lv.javaguru.java1.student_kirils_petrovs.lesson_7_array_for.homework.level_3_junior;

import java.util.Scanner;

public class CashRegisterAnalysisComputingTotalSalesAndAverageReceipts {

    public static void main(String[] args) {
        // Создаем массив объектов "Кассовый чек"
        CashReceipt[] receipts = inputReceipts();

        // Рассчитываем общую сумму продаж и среднюю стоимость покупки
        double totalSales = calculateTotalSales(receipts);
        double averageReceipt = calculateAverageReceipt(receipts);

        // Выводим результаты
        System.out.println("Общая сумма продаж: " + totalSales);
        System.out.println("Средняя стоимость покупки: " + averageReceipt);
    }

    // Метод для ввода данных о кассовых чеках
    private static CashReceipt[] inputReceipts() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество кассовых чеков:");
        int numberOfReceipts = scanner.nextInt();

        CashReceipt[] receipts = new CashReceipt[numberOfReceipts];

        for (int i = 0; i < numberOfReceipts; i++) {
            System.out.println("Введите номер чека для покупки " + (i + 1) + ":");
            int receiptNumber = scanner.nextInt();

            System.out.println("Введите сумму покупки для чека " + (i + 1) + ":");
            double purchaseAmount = scanner.nextDouble();

            receipts[i] = new CashReceipt(receiptNumber, purchaseAmount);
        }

        return receipts;
    }

    // Метод для расчета общей суммы продаж
    private static double calculateTotalSales(CashReceipt[] receipts) {
        double totalSales = 0;

        for (CashReceipt receipt : receipts) {
            totalSales += receipt.getPurchaseAmount();
        }

        return totalSales;
    }

    // Метод для расчета средней стоимости покупки
    private static double calculateAverageReceipt(CashReceipt[] receipts) {
        if (receipts.length == 0) {
            return 0; // Избегаем деления на ноль
        }

        double totalSales = calculateTotalSales(receipts);
        return totalSales / receipts.length;
    }
}

// Класс для представления кассового чека
class CashReceipt {
    private int receiptNumber;
    private double purchaseAmount;

    // Конструктор для инициализации объекта
    public CashReceipt(int receiptNumber, double purchaseAmount) {
        this.receiptNumber = receiptNumber;
        this.purchaseAmount = purchaseAmount;
    }

    // Геттер для получения суммы покупки
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
}
