package lv.javaguru.java1.student_artjoms_potasevskis.lesson_7.level_2;

class RandomIntArrayApp {
    public static void main(String[]args){

        RandomIntArray randomIntArray = new RandomIntArray();
        int[] array = randomIntArray.createAndFindArray();
        randomIntArray.printArray(array);
    }
}
