package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.homework.lvl_2;

public class RandomIntArrayApp {

    public static void main(String[] args) {
        RandomIntArray randomIntArray = new RandomIntArray();
        int[] array = randomIntArray.randomInt();
        randomIntArray.printArray(array);
    }
}
