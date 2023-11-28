package lv.javaguru.java1.student_sergejs_roslakovs.lesson_8_project_school_dairy_part_1.homework;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args){

    List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

    List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("Good bye");

        System.out.println("Integers:");
        for (int num : integerList) {
        System.out.println(num);
    }

        System.out.println("Strings:");
        for (String str : stringList) {
        System.out.println(str);
    }
}


    }







