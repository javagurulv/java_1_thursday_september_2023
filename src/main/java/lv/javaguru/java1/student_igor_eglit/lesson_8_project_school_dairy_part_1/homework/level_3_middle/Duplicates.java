package lv.javaguru.java1.student_igor_eglit.lesson_8_project_school_dairy_part_1.homework.level_3_middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1_000_000);
        for (int i = 0; i < 1_000_000; i++) {
            list.add(i, new Random().nextInt(2));
        }
        System.out.println("размер списка " + list.size());

        List<Integer> list2 = new ArrayList<>(1_000_000_000);
        for (int i = 0; i < 1_000_000_000; i++) {
            list.add(i, new Random().nextInt(2));
        }
        System.out.println(list2.size());


    }
}
