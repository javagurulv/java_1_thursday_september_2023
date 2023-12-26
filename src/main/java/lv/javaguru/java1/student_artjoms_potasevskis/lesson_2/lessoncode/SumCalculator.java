package lv.javaguru.java1.student_artjoms_potasevskis.lesson_2.lessoncode;

class SumCalculator {

    public int calculateSum(int start, int end) {

        int sum = 0;
        for (int i = start; i <= end; i++) {

            sum = sum + i;

        }
        return sum;

    }
}

