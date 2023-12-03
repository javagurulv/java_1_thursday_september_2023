package lv.javaguru.java1.teacher.lesson_8_project_school_dairy_part_1.lessoncode;

import java.util.Objects;

class Mark extends Object {

    private String subject;
    private int mark;

    public Mark(String subject, int mark) {
        this.subject = subject;
        this.mark = mark;
    }

    public static int maxMarkValue() {
        return 10;
    }

    public static int minMarkValue() {
        return 0;
    }


    public String getSubject() {
        return subject;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof Mark mark1)) return false;

        if (mark != mark1.mark) return false;
        return Objects.equals(subject, mark1.subject);
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + mark;
        return result;
    }
}
