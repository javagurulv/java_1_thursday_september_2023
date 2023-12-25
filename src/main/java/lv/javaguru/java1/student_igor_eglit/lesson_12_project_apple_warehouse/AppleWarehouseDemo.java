package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.List;
import java.util.Random;

class AppleWarehouseDemo {
    public List<Apple> appleStock() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        String[] appleColorList = {"green", "red", "yellow"};
        List<Apple> stock = null;
        for (int i = 1; i < 21; i++) {
            var indexColorList = new Random().nextInt(0, 3);
            Apple apple = new Apple(appleColorList[indexColorList]);
            stock = appleWarehouse.getAllApples(apple);
        }
        return stock;
    }

    private static void findByAppleColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        AppleWarehouseDemo appleWarehouseDemo = new AppleWarehouseDemo();
        List<Apple> stock = appleWarehouseDemo.appleStock();

        ByGreenColor(appleWarehouse, stock);
        ByRedColor(appleWarehouse, stock);
    }

    private static void ByGreenColor(AppleWarehouse appleWarehouse, List<Apple> stock) {
        Apple apple = new Apple("green");
        List<Apple> stockByColor = appleWarehouse.findAppleByParameter(stock, apple);
        System.out.println("Найдено на складе яблок цвета " + apple.getAppleColor() + " в количестве " + stockByColor.size() + " штук");
    }

    private static void ByRedColor(AppleWarehouse appleWarehouse, List<Apple> stock) {
        Apple apple = new Apple("red");
        List<Apple> stockByColor = appleWarehouse.findAppleByParameter(stock, apple);
        System.out.println("Найдено на складе яблок цвета " + apple.getAppleColor() + " в количестве " + stockByColor.size() + " штук");
    }

    public static void main(String[] args) {
        findByAppleColor();
    }
}
