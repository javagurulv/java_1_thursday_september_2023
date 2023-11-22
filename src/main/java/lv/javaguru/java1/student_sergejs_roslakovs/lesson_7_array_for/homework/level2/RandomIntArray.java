package lv.javaguru.java1.student_sergejs_roslakovs.lesson_7_array_for.homework.level2;

import java.util.Random;

class RandomIntArray {

    private int[] array;

    public RandomIntArray() {
        array = new int[10];
        fillArrayWithRandomNumbers();
    }

    public void fillArrayWithRandomNumbers() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }
    }

    public void printArray() {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }


}
