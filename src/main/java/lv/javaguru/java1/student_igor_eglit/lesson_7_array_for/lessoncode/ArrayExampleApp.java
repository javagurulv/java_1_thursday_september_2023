package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class ArrayExampleApp {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int[] array = arrayExample.createArray();

        array[1] = 9;
        array[3] = 7;
        array[5] = 3;
        array[9] = 7;
        array[7] = 8;

        int sum = arrayExample.calculateSum(array);
        System.out.println(sum + " =sum");
        System.out.println(arrayExample.calculateAverage(sum, array.length) + " = Average");
    }
}
