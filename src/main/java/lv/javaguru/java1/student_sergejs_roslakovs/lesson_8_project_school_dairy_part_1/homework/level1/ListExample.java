package lv.javaguru.java1.student_sergejs_roslakovs.lesson_8_project_school_dairy_part_1.homework.level1;

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

        System.out.println("Java cannot use Lists with primitive types.");

        System.out.println("The Integer class wraps a value of the primitive type int in an object, therefore, it can be used with Java Lists. Example:");
        for (int num : integerList) {
        System.out.println(num);
        }

        System.out.println("The String class represents character strings, therefore, it can be used with Java Lists. Example:");
        for (String str : stringList) {
        System.out.println(str);
        }
    }

}







