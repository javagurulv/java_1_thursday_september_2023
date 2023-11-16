package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

class ArrayExample {

    public int[] createArray() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }

        return array;
    }

    public int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public double calculateAverage(int sum, int arrayLength) {
        //double sumDouble = sum;
        //return sumDouble / arrayLength;
        return (double) sum / arrayLength;
    }

}
