package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class QuestionnaireApplication {

    public static void main(String[] args) {
        Question question1 = new Question("question 1?", "answer");
        Question question2 = new Question("question 2?", "answer");

        Questionnaire questionnaire = new Questionnaire(
                "Vasja", question1, question2
        );

        String person = questionnaire.getPerson();
        Question q1 = questionnaire.getQuestion1();
        Question q2 = questionnaire.getQuestion2();

        String text1 = q1.getQuestionText();
        String text2 = q2.getQuestionText();

        String answer1 = q1.getQuestionAnswer();
        String answer2 = q2.getQuestionAnswer();

    }

}
