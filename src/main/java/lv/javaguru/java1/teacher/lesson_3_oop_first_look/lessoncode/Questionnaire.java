package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

class Questionnaire {

    private String person;
    private Question question1;
    private Question question2;

    public Questionnaire(String person,
                         Question question1,
                         Question question2) {
        this.person = person;
        this.question1 = question1;
        this.question2 = question2;
    }

    public String getPerson() {
        return person;
    }

    public Question getQuestion1() {
        return question1;
    }

    public Question getQuestion2() {
        return question2;
    }
}
