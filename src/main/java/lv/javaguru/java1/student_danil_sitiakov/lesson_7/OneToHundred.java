package lv.javaguru.java1.student_danil_sitiakov.lesson_7;

class OneToHundred {
    public int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;

        }
        return sum;
    }

}
