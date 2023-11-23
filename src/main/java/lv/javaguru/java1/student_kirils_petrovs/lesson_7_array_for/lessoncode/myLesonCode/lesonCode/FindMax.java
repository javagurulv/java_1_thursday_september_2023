package lv.javaguru.java1.student_kirils_petrovs.lesson_7_array_for.lessoncode.myLesonCode.lesonCode;

class FindMax {

    public int findMax(int[] grads) {
        int maxNumber = grads[0];

        for (int i = 0; i < grads.length; i++) {
            if (grads[i] > maxNumber) {
                maxNumber = grads[i];
            }
        }

        return maxNumber;
    }
}