package lv.javaguru.java1.student_igor_eglit.lesson_9_project_school_dairy_part_2.lessoncode;

class Mark {

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
