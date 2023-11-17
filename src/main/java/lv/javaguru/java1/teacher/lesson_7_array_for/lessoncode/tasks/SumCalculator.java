package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

class SumCalculator {

    public int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int calculateSumStep2(int start, int end) {
        int sum = 0;

        // i++
        // i = i + 1

        for (int i = start; i <= end; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }


}
