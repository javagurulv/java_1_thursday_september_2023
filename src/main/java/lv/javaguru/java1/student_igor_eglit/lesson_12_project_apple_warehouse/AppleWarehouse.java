package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;


import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {
    List<Apple> allApples = new ArrayList<>();

    public List<Apple> makeStockAllApples(Apple apple) {
        allApples.add(apple);
        return allApples;
    }

    public List<Apple> findAppleByColor(List<Apple> allApples, String color) {
        List<Apple> stockByColor = new ArrayList<>();
        for (Apple apples : allApples) {
            if (color.equals(apples.getColor())) {
                stockByColor.add(apples);
            }
        }
        return stockByColor;
    }


    public Apple separationByWeight(List<Apple> allApples, int weight) {
        List<Apple> stockLightApples = new ArrayList<>();
        List<Apple> stockHeavyApples = new ArrayList<>();
        for (Apple apples : allApples) {
            if (apples.getWeight() <= weight) {
                stockLightApples.add(apples);
            } else {
                stockHeavyApples.add(apples);
            }
        }
        return new Apple(stockLightApples, stockHeavyApples);
    }

    public List<Apple> findAppleByDifferentParameters(List<Apple> allApples, String color, int weightFrom, int weightTo) {
        List<Apple> stockByParameters = new ArrayList<>();
        for (Apple apples : allApples) {
            if (color.equals("")) {
                if (weightFrom < apples.getWeight() && apples.getWeight() < weightTo) {
                    stockByParameters.add(apples);
                }
            }

            if (weightFrom == 0 && weightTo == 0) {
                if (color.equals(apples.getColor())) {
                    stockByParameters.add(apples);
                }
            }

            if (color.equals(apples.getColor())
                    && weightFrom < apples.getWeight()
                    && apples.getWeight() < weightTo) {
                stockByParameters.add(apples);
            }
        }
        return stockByParameters;
    }

    List<Apple> findApplesInterfaceSearch(AppleSearchCriteria searchCriteria, List<Apple> allApples){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: allApples){
            if(searchCriteria.test(apple)){
                result.add(apple);
            }
        }return result;
    }

}
//     static String[] apples = getAllApples();
//
//    public static String[] getAllApples() {
//        String[] apples = new String[4];
//        apples[0] = "green";
//        apples[1] = "red";
//        apples[2] = "red";
//        apples[3] = "green";
//        return apples;
//    }
//
//    public static void main(String[] args) {
//        System.out.print(Arrays.toString(apples));
//    }
