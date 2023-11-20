package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

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
            sum += array[i];
        }
        return sum;
    }

    public double calculateAverage(int sum, int arrayLength) {
        return (double) sum / arrayLength;
    }

}
