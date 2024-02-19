package lv.javaguru.java1.student_danil_sitiakov.lesson_8;


import java.util.ArrayList;
import java.util.List;

class IntegerListDemo {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println("adding to the end of the list" + list);
        list.add(0,3);
        System.out.println("adding to the beginning of the list" + list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("list size" + list);
        list.remove(Integer.valueOf(2));
        System.out.println("deleting an element 3" + list);
        list.remove(0);
        System.out.println("delete by index 0" +list);
        System.out.println("empty list" + list.isEmpty());
        for (Integer element: list)
        {
            System.out.println(element + " ");
        }
    }
}
