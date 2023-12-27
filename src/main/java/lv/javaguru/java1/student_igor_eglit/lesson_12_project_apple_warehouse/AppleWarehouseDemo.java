package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

class AppleWarehouseDemo {
    private Apple apple;
    private AppleSearchCriteria searchCriteria;

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
        appleWarehouseDemo.findByParameters(appleWarehouse, stock);
        appleWarehouseDemo.findWithInterfaceColorSearch(appleWarehouse, stock);
        appleWarehouseDemo.findWithInterfaceWeightSearch(appleWarehouse, stock);
        appleWarehouseDemo.findWithInterfaceGreenAndHeavySearch(appleWarehouse, stock);
        appleWarehouseDemo.findWithAnnonymClass(appleWarehouse,stock);


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
        System.out.println("Найдено " + stockByParameters.size() + " яблок соответствующих введенным параметрам");
    }

    private void findWithInterfaceColorSearch(AppleWarehouse appleWarehouse, List<Apple> stock) {
        var result = appleWarehouse.findApplesInterfaceSearch(new GreenAppleSearchCriteria(), stock);
        System.out.println("Результат зеленые яблоки через интерфейс = " + result.size() + "штук");
    }

    private void findWithInterfaceWeightSearch(AppleWarehouse appleWarehouse, List<Apple> stock) {
        var result = appleWarehouse.findApplesInterfaceSearch(new HeavyAppleSearchCriteria(), stock);
        System.out.println("Результат тяжелые яблоки яблоки через интерфейс = " + result.size() + "штук");
    }

    private void findWithInterfaceGreenAndHeavySearch(AppleWarehouse appleWarehouse, List<Apple> stock) {
        var result = appleWarehouse.findApplesInterfaceSearch(new GreenHeavySearchCriteria(), stock);
        System.out.println("Результат зеленые тяжелые яблоки яблоки через интерфейс = " + result.size() + "штук");
    }

    private void findWithAnnonymClass(AppleWarehouse appleWarehouse, List<Apple> stock) {
        List<Apple> redApples = appleWarehouse.findApplesInterfaceSearch(
                new AppleSearchCriteria() {
                    @Override
                    public boolean test(Apple apple) {
                        return "red".equals(apple.getAppleColor());
                    }
                },
                stock);
        System.out.println("Красные яблоки, найденные анонимным классом = " + redApples.size());
    }

    public static void main(String[] args) {
        findByAppleParameters();
    }
}
