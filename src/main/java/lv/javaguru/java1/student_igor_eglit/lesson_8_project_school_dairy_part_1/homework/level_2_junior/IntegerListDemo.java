package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.homework.level_2_junior;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(5);
        System.out.println(list);
        list.add(6);
        System.out.println("добавление в конец списка " + list);
        list.add(0, 4);
        System.out.println("добавление в начало списка " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("размер списка " + list.size());
        list.remove("6");
        System.out.println("удаление элемента 6 " + list);
        list.remove(0);
        System.out.println("удаление по индексу 0 " + list);
        System.out.println("пустой список? " + list.isEmpty());
    }
}
