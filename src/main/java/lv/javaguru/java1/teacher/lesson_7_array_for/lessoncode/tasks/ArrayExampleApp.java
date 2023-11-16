package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

class ArrayExampleApp {

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array = arrayExample.createArray();

        array[1] = 9;
        array[3] = 7;
        array[5] = 3;
        array[7] = 8;
        array[9] = 7;

        int sum = arrayExample.calculateSum(array);
        System.out.println("Sum = " + sum);

        double average = arrayExample.calculateAverage(sum, array.length);
        System.out.println("Average = " + average);
    }

}
