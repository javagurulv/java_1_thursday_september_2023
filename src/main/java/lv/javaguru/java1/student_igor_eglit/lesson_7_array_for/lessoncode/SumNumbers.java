package lv.javaguru.java1.student_igor_eglit.lesson_7_array_for.lessoncode;

class SumNumbers {
    public int sumNumbers(int numberFrom, int numberTo) {
        int sum = 0;
        for (int i = numberFrom; i <= numberTo; i++) {
            sum += i;
        }
        return sum;
    }

}
