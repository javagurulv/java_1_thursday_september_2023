package lv.javaguru.java1.teacher.lesson_7_array_for.homework.solutions.level_2_intern.task_7;

import java.util.Random;

class RandomIntArray {

    public int[] createAndFillArray() {
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
