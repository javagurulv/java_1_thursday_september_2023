package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_6;

public class ReportCardApp {

    public static void main(String[] args) {

        ReportCard tabelj1 = new ReportCard("Andrejs","Picilevics", 5,9,8);
        System.out.println(calculateAverageGrade(tabelj1));

        ReportCard tabelj2 = new ReportCard("Elena","Picilevica", 10,9,6);
        System.out.println(calculateAverageGrade(tabelj2));

        ReportCard tabelj3 = new ReportCard("Anna","Panna", 5,6,7);
        System.out.println(calculateAverageGrade(tabelj3));

    }

    public static double calculateAverageGrade(ReportCard reportCard){
        double averageGrade = (double)(reportCard.getMathGrade() + reportCard.getHistoryGrade() + reportCard.getBiologyGrade())/3;
        return averageGrade;
    }
}
