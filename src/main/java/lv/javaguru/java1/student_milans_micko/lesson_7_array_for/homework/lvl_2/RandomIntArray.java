package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_2;

import java.util.Random;

public class RandomIntArray {

    public int[] randomInt() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}
