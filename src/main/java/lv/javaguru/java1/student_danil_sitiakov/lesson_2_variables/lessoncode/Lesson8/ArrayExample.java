package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode.Lesson8;

public class ArrayExample {
    public int [] createArray(){
        int[] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array [i] = 0;
        }
        return array;

    }
    public int CaluclateSum(int [] array) {
        int sum = 0;
       for (int i = 0; i < array.length; i++) {
        sum = sum + array [i];
       }
       return sum;
    }


}
