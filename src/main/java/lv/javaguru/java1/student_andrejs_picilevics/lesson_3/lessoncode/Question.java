package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.lessoncode;

class Question {
    private String questionText;
    private String questionAnswer;

    public Question(String questionText, String questionAnswer) {
        this.questionText = questionText;
        this.questionAnswer = questionAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }
}
