package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_2;

import java.util.Random;

class RandomIntArray {

    public int[] createAndFindArray(){

        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){

            array[i] = random.nextInt(100);
        }
        return array;
    }
    public void printArray(int[] array){

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
