package lv.javaguru.java1.teacher.lesson_5_methods.homework.solutions.level_6_middle.task_1;

class StudentReportCard {

    private int mathGrade;
    private int engGrade;
    private int biologyGrade;
    private int sportGrade;

    public StudentReportCard(int mathGrade,
                             int engGrade,
                             int biologyGrade,
                             int sportGrade) {
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
        this.biologyGrade = biologyGrade;
        this.sportGrade = sportGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getEngGrade() {
        return engGrade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public int getSportGrade() {
        return sportGrade;
    }
}
