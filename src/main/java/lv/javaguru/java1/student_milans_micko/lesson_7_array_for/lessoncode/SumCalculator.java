package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode;

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

        for (int i = start; i <= end; i = i + 2) {
            sum = sum + i;

        }
        return sum;
    }
}

