package lv.javaguru.java1.student_artjoms_potasevskis.lesson_3.level_3;

class Book {

    private String title;
    private String author;
    private int releaseYear;
    private Chapter chapter1;
    private Chapter chapter2;

    public Book(String title,
                String author,
                int releaseYear,
                Chapter chapter1,
                Chapter chapter2) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.chapter1 = chapter1;
        this.chapter2 = chapter2;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Chapter getChapter1() {
        return chapter1;
    }

    public Chapter getChapter2() {
        return chapter2;
    }



}
