package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

class AnketaApplication {

   public static void main(String[] args) {

       String person;
       Anketa question1 = new Anketa("question1?", "Petja" );
       Anketa question2 = new Anketa("question2?", "Vasja");

       Anketa questionnaire = new Anketa("Vasja, question1, question2","Vasja");

       person = Anketa.getPerson();
       Anketa q1 = questionnaire.getQuestion1();
       Anketa q2 = questionnaire.getQuestion2();


   }






}
