package lv.javaguru.java1.student_valera_kovs.lesson8.lvl4;

import java.util.ArrayList;
import java.util.Random;

public class HugeListAdd {

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>(1000000000);

        for (int i = 0; i < 1000000000; i++) {
            Random random = new Random();
            i = random.nextInt(2);

            System.out.println("list2 " + list2.size());
        }
    }
}