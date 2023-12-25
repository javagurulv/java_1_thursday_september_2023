package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.List;
import java.util.Random;

class AppleWarehouseDemo {
    public static void appleStock() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        String[] appleColorList = {"green", "red", "yellow"};
        List<Apple> stock = null;
        for (int i = 1; i < 21; i++) {
            var indexColorList = new Random().nextInt(0, 3);
            Apple apple = new Apple(appleColorList[indexColorList]);
            stock = appleWarehouse.getAllApples(apple);
        }
        System.out.println(stock.size());
    }

    private static void findByAppleColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        List<Apple> stock = appleWarehouse.allApples;
        Apple apple = new Apple("red");
        List<Apple> stockByColor = appleWarehouse.findAppleColor(stock, apple);
        System.out.println(stockByColor.size());

    }

    public static void main(String[] args) {
        appleStock();
        findByAppleColor();

    }
}
