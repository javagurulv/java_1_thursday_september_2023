package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class QuestionnaireApp {
    public static void main(String[] args) {
        Question question1 = new Question("question1?","answer");
        Question question2 = new Question("question2?","answer");

Questionnaire questionnaire = new Questionnaire("Vasja", question1, question2);

String person = questionnaire.getPerson();
Question q1 = questionnaire.getQuestion1();
Question q2 = questionnaire.getQuestion2();

String text1 = q1.getQuestionText();
String text2 = q1.getQuestionText();

String answer1 = q1.getQuestionAnswer();
String answer2 = q1.getQuestionAnswer();
    }
}
