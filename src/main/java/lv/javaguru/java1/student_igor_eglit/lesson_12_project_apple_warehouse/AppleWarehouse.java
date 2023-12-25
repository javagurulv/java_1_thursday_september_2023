package lv.javaguru.java1.student_igor_eglit.lesson_12_project_apple_warehouse;

import java.util.Arrays;

class AppleWarehouse {

     static String[] apples = getAllApples();

    public static String[] getAllApples() {
        String[] apples = {};
        apples[1] = "green";
        apples[2] = "red";
        apples[3] = "red";
        apples[4] = "green";
        return apples;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(apples));
    }
}


