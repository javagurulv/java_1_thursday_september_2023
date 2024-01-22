package lv.javaguru.java1.student_artjoms_potasevskis.lesson_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Million {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            list.add(i, new Random().nextInt(2));
        }
        System.out.println("size list " + list.size());

        List<Integer> list2 = new ArrayList<>(1000000000);
        for (int i = 0; i < 1000000000; i++) {
            list.add(i, new Random().nextInt(2));
        }
        System.out.println(list2.size());


    }


}
