package lv.javaguru.java1.teacher.lesson_10_project_fraud_detector.list;

import java.util.Objects;

class Mark {

    private String subject;
    private int value;

    public Mark(String subject, int value) {
        this.subject = subject;
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mark mark)) return false;

        if (value != mark.value) return false;
        return Objects.equals(subject, mark.subject);
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + value;
        return result;
    }
}
