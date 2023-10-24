package lv.javaguru.java1.student_igor_eglit.lesson_3_oop_first_look.homework.level_3_junior;

class Book {
    private String title;
    private String author;
    private int year;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title, String author, int year, Chapter chapter1, Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }
}
