package lv.javaguru.java1.student_andrejs_picilevics.lesson_5.homework.level_6;

 class ReportCard {
    private String name;
    private String surname;
    private int mathGrade;
    private int historyGrade;
    private int biologyGrade;

     public ReportCard(String name, String surname, int mathGrade, int historyGrade, int biologyGrade) {
         this.name = name;
         this.surname = surname;
         this.mathGrade = mathGrade;
         this.historyGrade = historyGrade;
         this.biologyGrade = biologyGrade;
     }

     public String getName() {
         return name;
     }

     public String getSurname() {
         return surname;
     }

     public int getMathGrade() {
         return mathGrade;
     }

     public int getHistoryGrade() {
         return historyGrade;
     }

     public int getBiologyGrade() {
         return biologyGrade;
     }
 }
