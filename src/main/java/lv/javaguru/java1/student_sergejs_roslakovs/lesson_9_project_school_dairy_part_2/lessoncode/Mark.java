package lv.javaguru.java1.student_sergejs_roslakovs.lesson_9_project_school_dairy_part_2.lessoncode;

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
}