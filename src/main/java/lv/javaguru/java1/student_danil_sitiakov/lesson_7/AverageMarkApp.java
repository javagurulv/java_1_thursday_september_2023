package lv.javaguru.java1.student_danil_sitiakov.lesson_7;

class AverageMarkApp {
    public static void main(String[] args) {
        AverageMark averageMark = new AverageMark();
        int[] grades = averageMark.grades();

        grades[0] = 5;
        grades[1] = 6;
        grades[2] = 7;
        grades[3] = 8;
        grades[4] = 9;
    }

}
