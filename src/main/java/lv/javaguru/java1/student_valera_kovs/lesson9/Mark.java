package lv.javaguru.java1.student_valera_kovs.lesson9;

public class Mark {

    private String subject;
    private int markValue;

    public Mark(String subject, int markValue) {
        this.subject = subject;
        this.markValue = markValue;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarkValue() {
        return markValue;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
