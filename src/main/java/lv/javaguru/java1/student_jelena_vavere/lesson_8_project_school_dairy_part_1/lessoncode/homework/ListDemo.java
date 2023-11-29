package lv.javaguru.java1.student_jelena_vavere.lesson_8_project_school_dairy_part_1.lessoncode.homework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(); //создание списка для целых чисел
        integerList.add(6); //добавление элементов в список
        integerList.add(9);
        integerList.add(12);

        int firstElement = integerList.get(0); // извлечение первого элемента из списка. Integer -> int
        System.out.println("List of integer: " + integerList);
        System.out.println(" First element: " + firstElement);

        int lastElement = integerList.get(2); //извлечение последнего элемента из списка
        System.out.println("List of integer: "+ integerList);
        System.out.println("last element: " + lastElement);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.7);
        doubleList.add(3.2);

        double firstDoubleElement = doubleList.get(0);
        System.out.println("List of double" + doubleList);
        System.out.println("First of double" + firstDoubleElement);
    }

}
