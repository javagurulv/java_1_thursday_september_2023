package lv.javaguru.java1.teacher.lesson_3_oop_first_look.lessoncode;

public class Questionnaire {

    String name;
    Question questionOne;
    Question questionTwo;

    public Questionnaire(String name, Question questionOne, Question questionTwo) {
        this.name = name;
        this.questionOne = questionOne;
        this.questionTwo = questionTwo;
    }

}
