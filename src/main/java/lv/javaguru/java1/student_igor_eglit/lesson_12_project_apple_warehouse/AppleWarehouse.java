package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;


import java.util.ArrayList;
import java.util.List;

class AppleWarehouse {
    List<Apple> allApples = new ArrayList<>();

    public List<Apple> getAllApples(Apple apple) {
        allApples.add(apple);
        return allApples;
    }

    public List<Apple> findAppleByColor(List<Apple> allApples, Apple apple) {
        List<Apple> equals = new ArrayList<>();
        for (Apple apples : allApples) {
            if (apple.equals(apples)) {
                equals.add(apples);
            }
        }
        return equals;
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