package lv.javaguru.java1.student_milans_micko.lesson_7_array_for.lessoncode.lessoncode;

class MaxFinder {

    public int findMaxGrades(int [] grades) {
        int maxNumber = grades[0];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxNumber) {
                maxNumber = grades[i];
            }
        }
        return maxNumber;

    }


}
