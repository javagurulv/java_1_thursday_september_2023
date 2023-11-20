package lv.javaguru.java1.student_valera_kovs.lesson7;

class MaxGradeFinder {

    public int[] gradeArray() {
        int[] array = new int[5];
        return array;
    }

    public int findMaxGrade(int[] array) {
        int maxGrade = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxGrade < array[i]) {
                maxGrade = array[i];
            }
        }
        return maxGrade;
    }public int findMinGrade(int[] array) {
        int minGrade = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minGrade > array[i]) {
                minGrade = array[i];
            }
        }
        return minGrade;
    }

}
