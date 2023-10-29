package lv.javaguru.java1.student_andrejs_picilevics.lesson_3.homework.level_1;

class Chapter {

    private String title;
    private String text;

    public Chapter(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
