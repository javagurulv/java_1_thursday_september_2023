package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_2_intern;

import java.util.Arrays;
import java.util.Random;

class RandomIntArray {
    public int[] createRandomValueArray() {
        int[] array = new int[10];
        randomGenerator(array);
        return array;
    }

    private static void randomGenerator(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(0, 100);
        }
    }

    public void consolePrintArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }


}
