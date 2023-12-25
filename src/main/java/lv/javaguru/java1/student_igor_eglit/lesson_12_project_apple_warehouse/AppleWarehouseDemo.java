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
        System.out.println(stock.size());
        return stock;
    }

    private static void findByAppleColor() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        AppleWarehouseDemo appleWarehouseDemo = new AppleWarehouseDemo();
        List<Apple> stock = appleWarehouseDemo.appleStock();;
        Apple apple = new Apple("red");
        List<Apple> stockByColor = appleWarehouse.findAppleColor(stock, apple);
        System.out.println(stockByColor.size());

    }

    public static void main(String[] args) {
//        AppleWarehouseDemo appleWarehouseDemo = new AppleWarehouseDemo();
//        appleWarehouseDemo.appleStock();
        findByAppleColor();

    }
}
