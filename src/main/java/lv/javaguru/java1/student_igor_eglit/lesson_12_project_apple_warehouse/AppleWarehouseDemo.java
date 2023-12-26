package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

class AppleWarehouseDemo {
    private Apple apple;

    public List<Apple> appleStock() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        String[] appleColorList = {"green", "red", "yellow"};
        List<Apple> stock = null;
        for (int i = 1; i < 101; i++) {
            var indexColorList = new Random().nextInt(0, 3);
            Apple apple = new Apple(appleColorList[indexColorList], new Random().nextInt(70, 200));
            stock = appleWarehouse.makeStockAllApples(apple);
        }
        return stock;
    }

    private static void findByAppleParameters() {
        AppleWarehouse appleWarehouse = new AppleWarehouse();
        AppleWarehouseDemo appleWarehouseDemo = new AppleWarehouseDemo();
        List<Apple> stock = appleWarehouseDemo.appleStock();

        appleWarehouseDemo.ByGreenColor(appleWarehouse, stock);
        appleWarehouseDemo.ByRedColor(appleWarehouse, stock);
        appleWarehouseDemo.separationByWeight(appleWarehouse, stock);
        appleWarehouseDemo.findByParameters(appleWarehouse,stock);

    }

    private void ByGreenColor(AppleWarehouse appleWarehouse, List<Apple> stock) {

        List<Apple> stockByColor = appleWarehouse.findAppleByColor(stock, "green");
        System.out.println("Найдено на складе яблок цвета green в количестве " + stockByColor.size() + " штук");
    }

    private void ByRedColor(AppleWarehouse appleWarehouse, List<Apple> stock) {
        List<Apple> stockByColor = appleWarehouse.findAppleByColor(stock, "red");
        System.out.println("Найдено на складе яблок цвета red в количестве " + stockByColor.size() + " штук");
    }

    private void separationByWeight(AppleWarehouse appleWarehouse, List<Apple> stock) {
        this.apple = appleWarehouse.separationByWeight(stock, 150);
        var heavy = apple.getHeavyApples();
        var light = apple.getLightApples();
        System.out.println("Разделение по весу:");
        System.out.println("Тяжелых яблок " + heavy.size());
        System.out.println("Легких яблок " + light.size());


    }

    private void findByParameters(AppleWarehouse appleWarehouse, List<Apple> stock) {
        System.out.print("Введи цвет (red, green, yellow) или нажми enter оставив поле пустым: ");
        var color = new Scanner(System.in).nextLine();
        System.out.print("Введи вес от: ");
        var weightFrom = new Scanner(System.in).nextInt();
        System.out.print("Введи вес до: ");
        var weightTo = new Scanner(System.in).nextInt();
        List<Apple> stockByParameters =
                appleWarehouse.findAppleByDifferentParameters(stock, color, weightFrom, weightTo);
        System.out.println("Найдено " + stockByParameters.size()+ " яблок соответствующих введенным параметрам");
    }

    public static void main(String[] args) {
        findByAppleParameters();
    }
}
