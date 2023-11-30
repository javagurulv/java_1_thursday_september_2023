package lv.javaguru.java1.student_sergejs_roslakovs.lesson_8_project_school_dairy_part_1.homework;

import java.util.ArrayList;
import java.util.List;

public class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(0, 10);

        integerList.add(20);

        int length = integerList.size();
        System.out.println("Length of the list: " + length);

        integerList.remove(0);

        boolean isEmpty = integerList.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        for (Integer element : integerList) {
            System.out.println(element);
        }
    }




}
