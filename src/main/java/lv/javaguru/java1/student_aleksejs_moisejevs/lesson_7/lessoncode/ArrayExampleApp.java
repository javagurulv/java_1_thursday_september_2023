package lv.javaguru.java1.student_aleksejs_moisejevs.lesson_7.lessoncode;
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