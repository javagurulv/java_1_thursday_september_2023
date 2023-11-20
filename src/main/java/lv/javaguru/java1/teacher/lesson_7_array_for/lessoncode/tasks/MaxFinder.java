package lv.javaguru.java1.teacher.lesson_7_array_for.lessoncode.tasks;

class MaxFinder {

    public int findMax(int[] grades) {
        int max = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }

}
