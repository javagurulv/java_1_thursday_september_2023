package lv.javaguru.java1.student_danil_sitiakov.lesson_2_variables.lessoncode;

class Anketa {

    private final String AnketaText;

    public Anketa(String anketaText, String person) {
        AnketaText = anketaText;
        this.person = person;
    }

    public String getAnketaText() {
        return AnketaText;
    }

    public static String getPerson() {
        return person;
    }

    public Anketa getQuestion1() {
        return question1;
    }

    public Anketa getQuestion2() {
        return question2;
    }

    private Anketa question1;
    private Anketa question2;

    private static String person;




}
