package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_3_junior;

class Chapter {
    private String chapterTitle;
    private String chapterText;

    public Chapter(String chapterTitle, String chapterText) {
        this.chapterTitle = chapterTitle;
        this.chapterText = chapterText;
    }

    public String getChapterText() {
        return chapterText;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }
}
