package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.homework.level_2_intern;

public class RandomIntArrayApp {
    public static void main(String[] args) {
        RandomIntArray randomIntArray = new RandomIntArray();
        int [] generatedArray = randomIntArray.createRandomValueArray();
        randomIntArray.consolePrintArray(generatedArray);

    }
}
